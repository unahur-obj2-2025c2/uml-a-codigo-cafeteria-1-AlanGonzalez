package ar.edu.unahur.obj2.newComp.Combo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.newComp.Bebible.Cafe;
import ar.edu.unahur.obj2.newComp.Comestibles.Medialuna;
import ar.edu.unahur.obj2.newComp.Comestibles.TipoMedialuna;
import ar.edu.unahur.obj2.newComp.Consumible.Consumible;






public class ComboTest {
    @Test
    void testCombo(){
        Consumible cafe = new Cafe("Cafe", 150.0, 200, Boolean.FALSE);
        Consumible medialuna = new Medialuna("Medialuna manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("desayuno", 1000.0);
        
        combo.agregarProducto(cafe);
        combo.agregarProducto(medialuna);

        assertEquals(650.0, combo.costo());
    }

    @Test
    void testCostoOtroMas(){
        Consumible cafe = new Cafe("Cafe", 150.0, 200, Boolean.FALSE);
        Consumible medialuna = new Medialuna("Medialuna manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("desayuno", 100.0);
        
        combo.agregarProducto(cafe);
        combo.agregarProducto(medialuna);

        assertEquals(100.0, combo.costo());
    }

    @Test
    void testOtroCombo(){
        Consumible cafe = new Cafe("Cafe", 150.0, 200, Boolean.FALSE);
        Consumible medialuna = new Medialuna("Medialuna manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("desayuno", 1000.0);
        combo.agregarProducto(cafe);
        combo.agregarProducto(medialuna);

        Consumible medialunaExtra = new Medialuna("Medialuna manteca", 100.0, 200, TipoMedialuna.DE_MANTECA);

        List<Consumible> productos = List.of(combo,medialunaExtra);

        Combo superCombo = new Combo("desayuno con medialuna extra", 2000.0, productos);

        

        assertEquals(1150.0, superCombo.costo());
    }
}
