package inspetor.pin.com.br.inspetorpublico.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import inspetor.pin.com.br.inspetorpublico.DenunciaActivity_;
import inspetor.pin.com.br.inspetorpublico.MainActivity;
import inspetor.pin.com.br.inspetorpublico.MainActivity_;
import inspetor.pin.com.br.inspetorpublico.R;

/**
 * Created by clail on 04/10/2015.
 */
public class NotificationUtil {

    public static void create(Context context, int i, Intent intent, int idDrawable, CharSequence titulo, CharSequence mensagem) {
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(context).setSmallIcon(R.drawable.common_signin_btn_icon_dark).setContentTitle("Inspetor Público").setContentText(mensagem).setAutoCancel(true);

        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(context);
        taskStackBuilder.addParentStack(DenunciaActivity_.class);
        taskStackBuilder.addNextIntent(intent);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(pendingIntent);
        manager.notify(i, builder.build());
    }

}
