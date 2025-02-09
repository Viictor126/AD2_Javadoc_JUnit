package javabean;

import java.util.Scanner;

/**
 * Clase que proporciona operaciones matemáticas de resta.
 * Si alguno de los números de entrada es cero no daría ningún tipo de error ni lógico ni matemático.
 * Si no se permitieran números negativos se lanzaría un throw IllegalArgumentException con su pertinente documentación
 *<pre>{@code
 * public int resta(in a, int b){
 *     if (a < 0 || b < 0) {
 *         throw new IllegalArgumentException("Error: No se permiten números negativos.");
 *     }
 *     int resultado = a - b;
 *     if (resultado < 0) {
 *         throw new IllegalArgumentException("Error: El resultado no puede ser negativo.");
 *     }
 * }
 * }</pre>
 * @author Victor Sabariego aka (victor.sabariego221@comunidadunir.net)
 * @version 1.0
 * */

public class Resta {

    private static double num;

    /**
     * Resta de dos números reales.
     * @param num1 número que será restado por el siguiente
     * @param num2 número que resta al anterior
     * @return devuelve el resultado de la resta.
     * */
    public static double RestaReal(double num1, double num2){
        return num1 - num2;
    }

    /**
     * Resta de dos números enteros.
     * @param num1 número que será restado por el siguiente
     * @param num2 número que resta al anterior
     * @return devuelve el resultado de la resta.
     * */
    public static int RestaInt(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Resta de 3 números reales.
     * @param num1 número que será restado por el siguiente
     * @param num2 número qeu restará al anterior
     * @param num3 número que restará el resultado la resta anterior
     * @return devuelve el resultado de la resta.
     * */
    public static double RestaReal2(double num1, double num2, double num3){
        return num1 - num2 - num3;
    }

    /**
     * Resta que acumula el resultado
     * @param num1 número que restará al resultado anterior.
     * @return devuelve el resultado de la resta.
     * */
    public static double RestaAcum(double num1){
        return num -= num1;
    }

    /**
     * Menu para llamar a los metodos de esta clase con una sola llamada a este metodo.
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Que funcionalidad de la resta deseas utiliar?");
            System.out.println("1. RestaReal");
            System.out.println("2. RestaInt");
            System.out.println("3. RestaReal2");
            System.out.println("4. RestaAcum");
            System.out.println("5. Exit");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(Resta.RestaReal(1,2));
                    break;
                case 2:
                    System.out.println(Resta.RestaInt(1,2));
                    break;
                case 3:
                    System.out.println(Resta.RestaReal2(1,2,3));
                    break;
                case 4:
                    System.out.println("numero que será restado: " + num);
                    System.out.println(Resta.RestaAcum(1));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (opcion != 5);
    }
}
