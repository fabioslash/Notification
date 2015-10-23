package inspetor.pin.com.br.inspetorpublico.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.RootContext;

import java.util.List;

import inspetor.pin.com.br.inspetorpublico.R;
import inspetor.pin.com.br.inspetorpublico.adapter.item.ItemCardView;
import inspetor.pin.com.br.inspetorpublico.adapter.item.ItemCardView_;
import inspetor.pin.com.br.inspetorpublico.interfaces.ItemClickRecyclerView;
import inspetor.pin.com.br.inspetorpublico.model.Denuncia;

/**
 * Created by clail on 04/10/2015.
 */

@EBean
public class RecyclerViewAdapter extends RecyclerViewAdapterBase<String, ItemCardView> {

    @RootContext
    Context context;

    ItemClickRecyclerView itemClickRecyclerView;


    @Override
    protected ItemCardView onCreateItemView(ViewGroup patent, int viewType) {
        return ItemCardView_.build(context);
    }


    @Override
    public void onBindViewHolder(ViewHolderItemCardView<ItemCardView> holder, int position) {
        ItemCardView itemCardView = holder.getItem();
        Bitmap bit = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_play_dark);
        itemCardView.bind("8798982", listaString.get(position), listaString.get(position), bit);

        //Método que delega o click do item da RecyclerView para a classe que implemente a interface: ItemClickRecyclerView
        if (itemClickRecyclerView != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickRecyclerView.clickItemRecyclerView(new Denuncia());
                }
            });
        }

    }

    public void setListaString(List<String> listaString) {
        this.listaString = listaString;
    }


    public void setItemClickRecyclerView(ItemClickRecyclerView itemClickRecyclerView) {
        this.itemClickRecyclerView = itemClickRecyclerView;
    }


}
