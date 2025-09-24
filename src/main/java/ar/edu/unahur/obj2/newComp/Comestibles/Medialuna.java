package ar.edu.unahur.obj2.newComp.Comestibles;

public class Medialuna extends Comestible {
    private TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto(){
        return 0.0;
    }

    @Override
    public Double costo(){
        return switch(tipo){
            case TipoMedialuna.DE_MANTECA -> 500.0;
            case TipoMedialuna.DE_GRASA -> 250.0;
            case TipoMedialuna.DE_DULCE_DE_LECHE -> 550.0;
            default -> 0.0;
        };
    }
    
}
