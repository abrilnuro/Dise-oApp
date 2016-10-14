package com.example.aimew.laviedesign;

/**
 * Created by aimew on 14/10/2016.
 */

public class Promocion {

    String nombre_promocion;
    String Distancia;
    int Imagen;

    //constructor
    public Promocion(String nombre_promocion, String distancia, int imagen) {
        this.nombre_promocion = nombre_promocion;
        Distancia = distancia;
        Imagen = imagen;
    }


    //getters and sertters
    public String getNombre_promocion() {
        return nombre_promocion;
    }

    public void setNombre_promocion(String nombre_promocion) {
        this.nombre_promocion = nombre_promocion;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String distancia) {
        Distancia = distancia;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
