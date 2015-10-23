package inspetor.pin.com.br.inspetorpublico.gcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/**
 * Created by clail on 04/10/2015.
 */
public class NotificationUtil {

    public static void create(Context context, int i, Intent intent, int idDrawable, String titulo, String mensagem) {
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = new Notification(idDrawable, mensagem, System.currentTimeMillis());

        PendingIntent p = PendingIntent.getActivity(context, 0, intent, 0);

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        manager.notify(i, notification);
    }

}
