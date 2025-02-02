package javabean;


/**
 * Clase que proporciona operaciones matemáticas de resta.
 * @author Victor Sabariego aka (victor.sabariego221@comunidadunir.net)
 * @version 1.0
 * */

public class Resta {

    private double num;

    /**
     * Resta de dos números reales.
     * @param num1 número que será restado por el siguiente
     * @param num2 número que resta al anterior
     * @return devuelve el resultado de la resta.
     * */
    public double RestaReal(double num1, double num2){
        return num1 - num2;
    }

    /**
     * Resta de dos números enteros.
     * @param num1 número que será restado por el siguiente
     * @param num2 número que resta al anterior
     * @return devuelve el resultado de la resta.
     * */
    public int RestaInt(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Resta de 3 números reales.
     * @param num1 número que será restado por el siguiente
     * @param num2 número qeu restará al anterior
     * @param num3 número que restará el resultado la resta anterior
     * @return devuelve el resultado de la resta.
     * */
    public double RestaReal2(double num1, double num2, double num3){
        return num1 - num2 - num3;
    }

    /**
     * Resta que acumula el resultado
     * @param num1 número que restará al resultado anterior.
     * @return devuelve el resultado de la resta.
     * */
    public double RestaAcum(double num1){
        return num -= num1;
    }
}
