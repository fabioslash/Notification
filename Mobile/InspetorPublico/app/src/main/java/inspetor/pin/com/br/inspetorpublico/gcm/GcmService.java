package inspetor.pin.com.br.inspetorpublico.gcm;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import org.androidannotations.annotations.EService;

import inspetor.pin.com.br.inspetorpublico.DenunciaActivity_;
import inspetor.pin.com.br.inspetorpublico.MainActivity;
import inspetor.pin.com.br.inspetorpublico.MainActivity_;
import inspetor.pin.com.br.inspetorpublico.R;

/**
 * Created by clail on 04/10/2015.
 */

public class GcmService extends IntentService {


    public GcmService() {
        super(Constantes.PROJECT_NUMBER);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        Log.d("#", "GcmIntentService.onHandleIntent: " + extras);

        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);

        String messageType = gcm.getMessageType(intent);
        if (!extras.isEmpty()) {
            if (GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR.equals(messageType)) {
                onError(extras);
            } else if (GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE.equals(messageType)) {
                onMessage(extras);
            }
        }

        GcmBroadcastReceiver.completeWakefulIntent(intent);

    }

    private void onError(Bundle extras) {
        Log.d("#", "Erro: " + extras);
    }

    private void onMessage(Bundle extras) {
        String msg = extras.getString("msg");
        Log.d("#", msg);
        Intent intent = new Intent(this, DenunciaActivity_.class);
        intent.putExtra("msg", msg);
        NotificationUtil.create(this, 1, intent, R.drawable.ic_cast_dark, "Nova mensagem", msg);
    }
}
