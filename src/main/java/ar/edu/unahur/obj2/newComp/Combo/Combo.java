package ar.edu.unahur.obj2.newComp.Combo;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.newComp.Consumible.Consumible;



public class Combo implements Consumible {
    private String nombre;
    private Double precio;
    private List<Consumible> productos;


    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = new ArrayList<>();
    }
    public Combo(String nombre, Double precio, List<Consumible> productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }

    public void agregarProducto(Consumible consumible){
        productos.add(consumible);
    }

    public void eliminarProducto(Consumible consumible){
        productos.remove(consumible);
    }

    private Double costoTotalProducto(){
        return productos.stream().mapToDouble(Consumible::costo).sum();
    }

    @Override
    public Double costo() {
       return Double.min(precio, this.costoTotalProducto());
    }

    public String getNombre(){
        return nombre;
    }
    public List<Consumible> getProductos() {
        return productos;
    }

    
    
}
