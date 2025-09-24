package ar.edu.unahur.obj2.newComp.Comestibles;

import ar.edu.unahur.obj2.newComp.Consumible.Producto;

public abstract class Comestible extends Producto {
    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo(){
        return pesoGr * doCosto();
    }

    public abstract Double doCosto();
}
