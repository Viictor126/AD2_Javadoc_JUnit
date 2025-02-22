package testing;

import javabean.Multiplicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest {

    @Test
    void multiplicacion() {
        assertEquals(6.0, Multiplicacion.multiplicacion(2.0, 3.0), 0.0001);
        assertEquals(-15.5, Multiplicacion.multiplicacion(-5.0, 3.1), 0.0001);
    }

    @Test
    void multiplicacionEnteros() {
        assertEquals(10, Multiplicacion.multiplicacionEnteros(2, 5));
        assertEquals(-20, Multiplicacion.multiplicacionEnteros(-4, 5));
    }

    @Test
    void multiplicacionTresReales() {
        assertEquals(24.0, Multiplicacion.multiplicacionTresReales(2.0, 3.0, 4.0), 0.0001);
        assertEquals(-30.0, Multiplicacion.multiplicacionTresReales(-2.0, 3.0, 5.0), 0.0001);
    }

    @Test
    void potencia() {
        assertEquals(8.0, Multiplicacion.potencia(2.0, 3.0), 0.0001);
        assertEquals(1.0, Multiplicacion.potencia(5.0, 0.0), 0.0001);
    }
}