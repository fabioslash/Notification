package inspetor.pin.com.br.inspetorpublico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

import inspetor.pin.com.br.inspetorpublico.model.Denuncia;

@EActivity(R.layout.activity_denuncia)
public class DenunciaActivity extends Activity {

    @ViewById(R.id.textView_titulo_denuncia)
    TextView textViewTitulo;

    @ViewById(R.id.textView_id_denuncia)
    TextView textViewIdDenuncia;

    @ViewById(R.id.textView_descricao_denuncia)
    TextView textViewDescricaoDenuncia;

    @Extra
    Denuncia denuncia;



    @AfterViews
    public void afterViews() {
        textViewIdDenuncia.setText(denuncia.getId());
        textViewTitulo.setText(denuncia.getDescricao());
        textViewDescricaoDenuncia.setText(denuncia.getObjetivo());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("#", "DenunciaActivity msg: " + intent.getStringExtra("msg"));
        setInformacoesDenunciaNotificacao(intent.getStringExtra("msg"));
    }

    @UiThread
    public void setInformacoesDenunciaNotificacao(String msg) {
        textViewTitulo.setText(msg);
    }

}
