package inspetor.pin.com.br.inspetorpublico.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by clail on 03/10/2015.
 */
public abstract class RecyclerViewAdapterBase<T, V extends View> extends RecyclerView.Adapter<ViewHolderItemCardView<V>> {

    protected List<T> listaString;


    @Override
    public int getItemCount() {
        return listaString.size();
    }


    @Override
    public ViewHolderItemCardView<V> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolderItemCardView<V>(onCreateItemView(parent, viewType));
    }


    protected abstract V onCreateItemView(ViewGroup patent, int viewType);
}
