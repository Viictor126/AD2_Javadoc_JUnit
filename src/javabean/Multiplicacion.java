package javabean;

public class Multiplicacion {
    /*
    Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
Esta clase tendrá los siguientes métodos:
Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
solución.
Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
solución.
Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la
solución.
Potencia, tendrá dos parámetros de entrada (base y exponente) y uno de salida que será la solución
     */
    public double multiplicacion(double a, double b){
        return a * b;
    }

    public int multiplicacionEnteros(int c, int d){
        return c * d;
    }

    public double multiplicacionTresReales(double e, double f, double g){
        return e * f * g;
    }

    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
}

