package inspetor.pin.com.br.inspetorpublico.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by clail on 04/10/2015.
 */
public class ViewHolderItemCardView<V extends View> extends RecyclerView.ViewHolder {

    V item;


    public ViewHolderItemCardView(V itemView) {
        super(itemView);
        this.item = itemView;
    }


    public V getItem() {
        return item;
    }


}
