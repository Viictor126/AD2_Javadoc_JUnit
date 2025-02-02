package javabean;

public class Resta {

    /*Esta clase implementará todos los métodos que están relacionados con la resta de la calculadora. Esta clase
     *tendrá los siguientes métodos:
     *  1. javabean.Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     *  2. javabean.Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     *  3. javabean.Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
     *  4. javabean.Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor
     *     acumulado. */

    private double num;

    public double RestaReal(double num1, double num2){
        return num1 - num2;
    }

    public int RestaInt(int num1, int num2){
        return num1 - num2;
    }

    public double RestaReal2(double num1, double num2, double num3){
        return num1 - num2 - num3;
    }

    public double RestaAcum(double num1){
        return num -= num1;
    }
}
