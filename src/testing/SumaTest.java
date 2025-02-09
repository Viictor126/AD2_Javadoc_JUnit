package testing;

import javabean.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @Test
    void sumaEnteros() {
        assertEquals(5, Suma.sumaEnteros(2, 3));
        assertEquals(-3, Suma.sumaEnteros(-1, -2));
        assertEquals(0, Suma.sumaEnteros(0, 0));
    }

    @Test
    void sumaReales() {
        assertEquals(5.5, Suma.sumaReales(2.2, 3.3), 0.0001);
        assertEquals(-3.3, Suma.sumaReales(-1.1, -2.2), 0.0001);
        assertEquals(0.0, Suma.sumaReales(0.0, 0.0), 0.0001);
    }

    @Test
    void sumaTresReales() {
        assertEquals(6.6, Suma.sumaTresReales(2.2, 2.2, 2.2), 0.0001);
        assertEquals(-6.0, Suma.sumaTresReales(-2.0, -2.0, -2.0), 0.0001);
        assertEquals(0.0, Suma.sumaTresReales(0.0, 0.0, 0.0), 0.0001);
    }
}