package com.example.aimew.laviedesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aimew on 14/10/2016.
 */

public class FragmentRecyclerPromo extends Fragment{

    private List<Promocion> promoLista;
    private RecyclerView recyclerPromo;
    private LinearLayoutManager llm;
    private PromoAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //crear la lista
        promoLista = new ArrayList<Promocion>();
        //llenar la lista
        llenaLista();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recycler_promo_fragment, container, false);

        //referenciar al recyclerView
        recyclerPromo = (RecyclerView)v.findViewById(R.id.recycler_promo);

        //crear el LayoutManager
        llm = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);

        //asignar el layoutManager al recyclerView
        recyclerPromo.setLayoutManager(llm);

        //crear la instancia del adaptador y agregarle la lista
        adapter = new PromoAdapter(promoLista);

        //asignar el adaptador al recyclerView
        recyclerPromo.setAdapter(adapter);

        return v;
    }

    //metodo para llenar la lista
    public void llenaLista(){
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
        promoLista.add(new Promocion("Viernes casual", "3km", R.drawable.imagen_restaurante));
    }
}//class
