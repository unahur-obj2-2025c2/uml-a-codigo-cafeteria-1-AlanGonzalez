package ar.edu.unahur.obj2.newComp.Bebible;

public class Cafe extends Bebible{
    private Boolean esConLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean esConLeche) {
        super(nombre, precioBase, capacidadMl);
        this.esConLeche = esConLeche;
    }

    @Override
    public Double costo(){
        return super.costo() + (esConLeche ? 5.0 : 0.0) ;
    }
}
