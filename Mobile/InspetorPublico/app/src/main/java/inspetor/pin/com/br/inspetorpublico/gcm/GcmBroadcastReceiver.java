package inspetor.pin.com.br.inspetorpublico.gcm;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

import org.androidannotations.annotations.EReceiver;

/**
 * Created by clail on 04/10/2015.
 */

@EReceiver
public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("#", "GcmBroadcastReceiver.onReceive: "+ intent.getExtras());

        ComponentName comp = new ComponentName(context.getPackageName(), GcmService.class.getName());
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
    }

}
