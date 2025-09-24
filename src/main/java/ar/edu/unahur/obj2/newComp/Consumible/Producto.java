package ar.edu.unahur.obj2.newComp.Consumible;

public abstract class Producto implements Consumible{
    protected String nombre;
    protected Double precioBase;

    public Producto(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    
    @Override
    public Double costo() {
        return precioBase;
    }
}
