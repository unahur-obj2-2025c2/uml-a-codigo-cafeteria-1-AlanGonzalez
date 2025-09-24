package ar.edu.unahur.obj2.newComp.Comestibles;

public class Tostado extends Comestible{
    private Tipo tipoTostado;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, Tipo tipoTostado) {
        super(nombre, precioBase, pesoGr);
        this.tipoTostado = tipoTostado;
    }

    @Override
    public Double doCosto(){
        return switch(tipoTostado){
            case Tipo.JAMON_Y_QUESO -> 2.0;
            case Tipo.SALAME_Y_QUESO -> 5.0;
        };
    }
}
