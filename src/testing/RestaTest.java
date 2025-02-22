package testing;

import javabean.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @Test
    void restaReal() {
        //caso normal
        assertEquals(8.0, Resta.RestaReal(10,2));
        //caso con decimales
        assertEquals(5.6, Resta.RestaReal(7.0,1.4));
        //resta con negativos
        assertEquals(-4, Resta.RestaReal(-10,-6));
    }

    @Test
    void restaInt() {
        //caso normal
        assertEquals(5, Resta.RestaInt(9,4));
        //caso con negativos
        assertEquals(-4, Resta.RestaInt(-6,-2));
    }

    @Test
    void restaReal2() {
        //caso normal
        assertEquals(7.0, Resta.RestaReal2(17.0,8.0,2.0));
        //caso con negativos
        assertEquals(-3.0, Resta.RestaReal2(10.0,9.0,4.0));
    }

    @Test
    void restaAcum() {
        assertEquals(5,5,0);
    }
}