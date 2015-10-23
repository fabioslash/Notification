package inspetor.pin.com.br.inspetorpublico.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import inspetor.pin.com.br.inspetorpublico.R;
import inspetor.pin.com.br.inspetorpublico.adapter.item.ItemCardView;
import inspetor.pin.com.br.inspetorpublico.adapter.item.ItemCardView_;
import inspetor.pin.com.br.inspetorpublico.controllers.DenunciaController;
import inspetor.pin.com.br.inspetorpublico.interfaces.ItemClickRecyclerView;
import inspetor.pin.com.br.inspetorpublico.model.Denuncia;

/**
 * Created by clail on 04/10/2015.
 */

@EBean
public class RecyclerViewAdapter extends RecyclerViewAdapterBase<Denuncia, ItemCardView> {

    @RootContext
    Context context;

    @Bean
    DenunciaController denunciaController;

    ItemClickRecyclerView itemClickRecyclerView;


    @Override
    protected ItemCardView onCreateItemView(ViewGroup patent, int viewType) {
        return ItemCardView_.build(context);
    }


    @Override
    public void onBindViewHolder(ViewHolderItemCardView<ItemCardView> holder, int position) {
        ItemCardView itemCardView = holder.getItem();
        Bitmap logoDenuncia = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_icon);
        itemCardView.bind(listaDenuncia.get(position).getId(), listaDenuncia.get(position).getDescricao(), listaDenuncia.get(position).getObjetivo(), logoDenuncia);

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

    public void setListaDenuncias(List<Denuncia> listaDenuncia) {
        this.listaDenuncia = listaDenuncia;
    }


    public void setItemClickRecyclerView(ItemClickRecyclerView itemClickRecyclerView) {
        this.itemClickRecyclerView = itemClickRecyclerView;
    }


}
