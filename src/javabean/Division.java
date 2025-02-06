package javabean;

/**
 * Clase que proporciona operaciones matemáticas de division.
 * @author Victor Sabariego aka (victor.sabariego221@comunidadunir.net)
 * @version 1.0
 * */

public class Division {

    /**
     * Divide dos números reales.
     * Si el divisor es 0 el resultado siempre será 0.
     * @param div1 divisor que será dividido pro el siguiente.
     * @param div2 divisor que dividirá al siguiente.
     * @return devuelve el cociente de la division.
     * @throws IllegalArgumentException Si algún número es negativo o si el denominador es cero.
     * */
    public static double DivReal(double div1, double div2) {
        if (div1 < 0 || div2 <= 0) {
            throw new IllegalArgumentException("Error: No se permiten números negativos.");
        }

        double resultado = div1 / div2;

        // Verificar si el resultado es infinito o NaN (para casos extremos)
        if (Double.isInfinite(resultado) || Double.isNaN(resultado)) {
            throw new ArithmeticException("Error: Resultado no válido.");
        }

        return resultado;
    }

    /**
     * Divide dos números enteros.
     * @param div1 divisor que será dividido pro el siguiente (debe ser positivo).
     * @param div2 divisor que dividirá al siguiente (debe ser positivo y distinto de cero).
     * @return devuelve el cociente de la division. Si el resultado no es entero devuelve un resultado truncado.
     * @throws IllegalArgumentException Si el numerador o denominador son negativos, o el denominador es cero.
     * */
    public static int DivInt(int div1, int div2) {
        if (div1 < 0 || div2 <= 0) {
            throw new IllegalArgumentException("Error: No se permiten números negativos.");
        }
        return div1 / div2;
    }

    /**
     * Genera el inverso del número dado.
     * @param num numero que será invertido
     * @return devuelve el numero inverso
     * @throws ArithmeticException si el numero dado es 0.
     * */
    public static double Inverse(double num) {
        if (num != 0)
           return num/(num*num);
        else
           throw new ArithmeticException("No se puede calcular el inverso de 0");
    }
}
