package inspetor.pin.com.br.inspetorpublico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import inspetor.pin.com.br.inspetorpublico.adapter.RecyclerViewAdapter;
import inspetor.pin.com.br.inspetorpublico.controllers.DenunciaController;
import inspetor.pin.com.br.inspetorpublico.gcm.Constantes;
import inspetor.pin.com.br.inspetorpublico.gcm.GCM;
import inspetor.pin.com.br.inspetorpublico.interfaces.ItemClickRecyclerView;
import inspetor.pin.com.br.inspetorpublico.model.Denuncia;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.menu_main)
public class MainActivity extends Activity implements ItemClickRecyclerView {

    @ViewById(R.id.recyclerView)
    RecyclerView recyclerView;

    @Bean
    RecyclerViewAdapter recyclerViewAdapter;

    @Bean
    DenunciaController denunciaController;

    List<Denuncia> listaDenuncias = new ArrayList<Denuncia>();


    @AfterViews
    public void afterViews() {

        listaDenuncias = denunciaController.getDenunciasDB();
        recyclerViewAdapter.setItemClickRecyclerView(this);
        recyclerViewAdapter.setListaDenuncias(listaDenuncias






        );

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(false);

        recyclerView.setAdapter(recyclerViewAdapter);

       /* ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Tab 1").setTabListener(new ItemTabView()));
        actionBar.addTab(actionBar.newTab().setText("Tab 2").setTabListener(new ItemTabView()));*/


        if (checkPlayServices()) {
            registrarGcm();
        }

    }



    @OptionsItem(R.id.action_settings)
    void menuSobre() {
        Toast.makeText(MainActivity.this, "Toast do menu", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String msg = intent.getStringExtra("msg");
        Log.d("#", msg);
    }


    @UiThread
    public void registrarGcm() {
       /*final Handler handler = new Handler();
        new Thread() {
            @Override
            public void run() {
                super.run();
                handler.post(new Runnable() {
                    @Override
                    public void run() {*/
                        String regId = GCM.getRegistrationId(MainActivity.this);

                        if (regId != null) {
                            regId = GCM.register(MainActivity.this, Constantes.PROJECT_NUMBER);
                            Log.d("#", "Registrado com sucesso, RegID: "+ regId);
                            Toast.makeText(MainActivity.this, "RegID: "+regId, Toast.LENGTH_LONG).show();
                        } else {
                            Log.d("#", "Erro no registro do GCM"+regId);
                            Toast.makeText(MainActivity.this, "Erro no RegID", Toast.LENGTH_LONG).show();
                        }
                    /*}
                });
            }
        }.start();*/
    }


    /**
     * Método que verifica se o dispositivo já tem o PlayServices instalado
     * @return true se o dispositivo já tem o PlayServices
     */
    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(MainActivity.this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
                GooglePlayServicesUtil.getErrorDialog(resultCode, MainActivity.this, PLAY_SERVICES_RESOLUTION_REQUEST).show();

            } else {
                Log.d("#", "Este dispositivo nao suporta o Google Play Services");
                finish();
            }
            return false;
        }
        return true;
    }


    /**
     * Evento do click em um item da RecyclerView
     */
    @Override
    public void clickItemRecyclerView(Denuncia denuncia) {
        Log.d("#", "Clique na denuncia de objetivo: "+ denuncia.getObjetivo());
        DenunciaActivity_.intent(MainActivity.this).extra("denuncia", denuncia).start();
    }


}
