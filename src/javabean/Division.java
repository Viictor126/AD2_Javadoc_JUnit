package javabean;

/**
 * Clase que proporciona operaciones matemáticas de division.
 * @author Victor Sabariego aka (victor.sabariego221@comunidadunir.net)
 * @version 1.0
 * */

public class Division {

    /**
     * Divide dos números reales.
     * @param div1 divisor que será dividido pro el siguiente.
     * @param div2 divisor que dividirá al siguiente.
     * @return devuelve el cociente de la division.
     * */
    public double DivReal(double div1, double div2) {
        return div1 / div2;
    }

    /**
     * Divide dos números enteros.
     * @param div1 divisor que será dividido pro el siguiente.
     * @param div2 divisor que dividirá al siguiente.
     * @return devuelve el cociente de la division.
     * */
    public int DivInt(int div1, int div2) {
        return div1 / div2;
    }

    /**
     * Genera el inverso del número dado.
     * @param num numero que será invertido
     * @return devuelve el numero inverso
     * @throws ArithmeticException si el numero dado es 0.
     * */
    public double Inverse(double num) {
        if (num != 0)
           return num/(num*num);
        else
           throw new ArithmeticException("No se puede calcular el inverso de 0");
    }
}
