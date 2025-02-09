package javabean;

import java.util.Scanner;

/**
 * Clase de multiplicación
 * @author Wilmer Oscategui(github:wmoises40)
 * @version 1.0
 */
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

    /**
     * @param a Multiplicando
     * @param b Multiplicador
     * @return Producto
     */
    public static double multiplicacion(double a, double b){
        return a * b;
    }

    /**
     * @param c Multiplicando
     * @param d Multiplicador
     * @return Producto
     */
    public static int multiplicacionEnteros(int c, int d){
        return c * d;
    }

    /**
     * @param e Primer número a multiplicar
     * @param f Segundo número a multiplicar
     * @param g Tercer número a multiplicar
     * @return Producto
     */
    public static double multiplicacionTresReales(double e, double f, double g){
        return e * f * g;
    }

    /**
     * @param base
     * @param exponente
     * @return Resultado
     */
    public static double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Que funcionalidad de la multiplicacion deseas utiliar?");
            System.out.println("1. Multiplicacion de reales");
            System.out.println("2. Multiplicacion de enteros");
            System.out.println("3. Multiplicacion de tres reales");
            System.out.println("4. Potencia");
            System.out.println("5. Exit");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(Multiplicacion.multiplicacion(1, 2));
                    break;
                case 2:
                    System.out.println(Multiplicacion.multiplicacionEnteros(1, 2));;
                    break;
                case 3:
                    System.out.println(Multiplicacion.multiplicacionTresReales(1,2,3));;
                    break;
                case 4:
                    System.out.println(Multiplicacion.potencia(1,2));;
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }

        }while (opcion != 5);
    }


}

