package ar.edu.unahur.obj2.newComp.Bebible;

import ar.edu.unahur.obj2.newComp.Consumible.Producto;

public abstract class Bebible extends Producto{
    protected Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    

    
}
