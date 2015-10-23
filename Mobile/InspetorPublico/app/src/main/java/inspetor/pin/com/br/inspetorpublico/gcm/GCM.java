package inspetor.pin.com.br.inspetorpublico.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import org.androidannotations.annotations.Background;

import java.io.IOException;

/**
 * Created by clail on 04/10/2015.
 */
public class GCM {

    private static final String PROPERTY_REG_ID = "registration_id";


    private static SharedPreferences getGCMPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("inspetorPublico", Context.MODE_PRIVATE);
        return sharedPreferences;
    }


    public static String getRegistrationId(Context context) {
        final SharedPreferences prefs = getGCMPreferences(context);
        String registrationId = prefs.getString(PROPERTY_REG_ID, "");
        if (registrationId == null || registrationId.trim().length() == 0) {
            return null;
        }

        return registrationId;
    }


    private static void saveRegistrationId(Context context, String registrationId) {
        final SharedPreferences prefs = getGCMPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(PROPERTY_REG_ID, registrationId);
        editor.commit();
    }


    public static String register(final Context context, final String projectNumber) {
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(context);
                String registrationId = null;

                /*try {
                    Log.d("#", "GCM.registrar() número do projeto: "+ projectNumber);
                    registrationId = gcm.register(projectNumber);

                    if (registrationId != null) {
                        saveRegistrationId(context, registrationId);
                    }

                    Log.d("#", "GCM.registrar() com sucesso, registrationID: "+ registrationId);
                    return registrationId;

                } catch (IOException e) {
                    Log.d("#", "GCM.registrar() Erro: "+ e.getMessage());
                    e.printStackTrace();
                }*/

                try {
                    InstanceID instanceID = InstanceID.getInstance(context);
                    registrationId = instanceID.getToken(projectNumber, GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
                    Log.d("#", "Registration ID com Token: "+ registrationId);

                } catch (IOException e) {
                    Log.d("#", "GCM.registrar() Erro: "+ e.getMessage());
                    e.printStackTrace();
                }

                return registrationId;
            }
        }.execute(null, null, null);


        return null;
    }


    public static void unregister(Context context) {
        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(context);

        try {
            gcm.unregister();
            saveRegistrationId(context, null);
            Log.d("#", "GCM cancelado com sucesso");

        } catch (IOException e) {
            Log.d("#", "GCM erro ao desregistrar: "+ e.getMessage());
        }

    }


}
