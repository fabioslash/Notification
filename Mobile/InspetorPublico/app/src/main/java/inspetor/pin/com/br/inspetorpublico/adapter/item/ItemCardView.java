package inspetor.pin.com.br.inspetorpublico.adapter.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import inspetor.pin.com.br.inspetorpublico.R;

/**
 * Created by clail on 03/10/2015.
 */

@EViewGroup(R.layout.item_card_view)
public class ItemCardView extends LinearLayout {

    @ViewById(R.id.textView_titulo)
    TextView textViewTitulo;

    @ViewById(R.id.textView_subtitulo)
    TextView textViewSubTitulo;

    @ViewById(R.id.textView_id)
    TextView textViewId;

    @ViewById(R.id.imageView_image)
    ImageView imageViewImagemDenuncia;

    Context context;


    public ItemCardView(Context context) {
        super(context);
        this.context = context;
    }

    public ItemCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void bind(String id, String titulo, String descricao, Bitmap imagemDenuncia) {
        textViewId.setText(id);
        textViewTitulo.setText(titulo);
        textViewSubTitulo.setText(descricao);
        imageViewImagemDenuncia.setImageBitmap(imagemDenuncia);
    }


}
