package testing;

import javabean.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void divReal() {
        //caso normal
        assertEquals(4.0, Division.DivReal(20,5));
        //caso con reales
        assertEquals(2.5, Division.DivReal(5,2));
        //caso con divisor 0
        assertThrows(IllegalArgumentException.class, () -> Division.DivReal(5, 0));
        //caso con negativo
        assertThrows(IllegalArgumentException.class, () -> Division.DivReal(-5, 2));
    }

    @Test
    void divInt() {
        //caso normal
        assertEquals(6, Division.DivInt(24,4));
        //caso con resultado decimal
        assertEquals(3, Division.DivInt(7,2));
        // Caso con divisor 0
        assertThrows(IllegalArgumentException.class, () -> Division.DivInt(5, 0));
        // Caso con número negativo
        assertThrows(IllegalArgumentException.class, () -> Division.DivInt(-5, 2));
    }

    @Test
    void inverse() {
        //caso normal
        assertEquals(0.5, Division.Inverse(2));
        //caso 0
        assertThrows(ArithmeticException.class, () -> Division.Inverse(0));
    }
}