package javabean;

public class Division {
    /*Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. Esta
     *clase tendrá los siguientes métodos:
     *  1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     *  2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
     *  solución.
     *  3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
     *  4. Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución.
      */

    public double DivReal(double div1, double div2) {
        return div1 / div2;
    }

    public int DivInt(int div1, int div2) {
        return div1 / div2;
    }

    public double Inverse(double num) {
        if (num != 0)
           return num/(num*num);
        else
           throw new ArithmeticException("No se puede calcular el inverso de 0");
    }
}
