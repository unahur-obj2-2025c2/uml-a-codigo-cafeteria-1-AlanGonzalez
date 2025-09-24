package ar.edu.unahur.obj2.newComp.Comestibles;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComestibleTest {
    @Test
    void testCosto(){
        Comestible medialuna = new Medialuna("medialuna de manteca", 150.0, 200, TipoMedialuna.DE_MANTECA);
        assertEquals(500, medialuna.costo());
    }
}
