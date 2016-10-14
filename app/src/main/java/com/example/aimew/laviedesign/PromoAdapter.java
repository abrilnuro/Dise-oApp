package com.example.aimew.laviedesign;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aimew on 14/10/2016.
 */

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.PromoViewHolder> {

    private List<Promocion> listPromo;

    //constructor
    public PromoAdapter(List<Promocion> listPromo) {
        this.listPromo = listPromo;
    }

    public static class PromoViewHolder extends RecyclerView.ViewHolder{

        TextView textNombrePromo;
        TextView textDistancia;
        ImageView imagePromo;

        public PromoViewHolder(View itemView) {
            super(itemView);
            textNombrePromo = (TextView)itemView.findViewById(R.id.text_card_nombre_lugar);
            textDistancia = (TextView)itemView.findViewById(R.id.text_card_distancia_lugar);
            imagePromo = (ImageView)itemView.findViewById(R.id.image_card_logo_lugar);
        }
    }

    @Override
    public PromoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.promo_card_item, parent, false);
        PromoViewHolder pvh = new PromoViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PromoViewHolder holder, int position) {
        holder.textNombrePromo.setText(listPromo.get(position).getNombre_promocion());
        holder.textDistancia.setText(listPromo.get(position).getDistancia());
        holder.imagePromo.setImageResource(listPromo.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listPromo.size();
    }
}//class
