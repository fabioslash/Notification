package inspetor.pin.com.br.inspetorpublico;

import android.app.Activity;
import android.support.annotation.UiThread;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_splash)
public class SplashActivity extends Activity {

    @ViewById(R.id.imageView_icon)
    ImageView imageViewIcon;

    @ViewById(R.id.textView_titulo_splash)
    TextView textViewTitulo;


    @AfterViews
    public void afterView() {
        imageViewIcon.setAnimation(animationIcon());
        textViewTitulo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.in_splash_animation));
    }


    @UiThread
    public Animation animationIcon() {
        Animation anim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.in_splash_animation);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                MainActivity_.intent(SplashActivity.this).start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        return anim;

    }

}
