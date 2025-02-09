package javabean;

import java.util.Scanner;

/**
 * Clase para sumar.
 * @author Wilmer Oscategui(github:wmoises40)
 * @version 1.0
 */

public class Suma {
    /*
    Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora. Esta
clase tendrá los siguientes métodos:
Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
     */


    /**
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Devuelve el resultado.
     */
    public static int sumaEnteros(int a, int b){
        return a + b;
    }

    /**
     *
     * @param c Primer número a sumar
     * @param d Segundo número a sumar
     * @return Devuele el resultado (reales)
     */
    public static double sumaReales(double c, double d){
        return c + d;
    }

    /**
     *
     * @param e Primer número a sumar.
     * @param f Segundo número a sumar.
     * @param g Tercer número a sumar.
     * @return Devuele el resultado
     */
    public static double sumaTresReales(double e, double f, double g){
        return e + f + g;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Que funcionalidad de la suma deseas utiliar?");
            System.out.println("1. SumaEnteros");
            System.out.println("2. SumaReales");
            System.out.println("3. SumaTresReales");
            System.out.println("4. Exit");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(Suma.sumaEnteros(1,2));;
                    break;
                case 2:
                    System.out.println(Suma.sumaReales(1,2));;
                    break;
                case 3:
                    System.out.println(Suma.sumaTresReales(1,2,3));;
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }

        }while (opcion != 5);
    }

    /**
     * Documentacion en casos especiales:
     * - En caso de la suma y resta no es algo importante. En la multiplicación, cualquier
     * número multiplicado por 0 da 0, no es mayor problema. En la división, de ser uno de
     * los parametros 0, saltará un mensaje diciendo que tal operación no es posible. En la potenci,
     * 0 elevado a cualquier número da simplemente 0, y un número eleveado a 0 da 1.
     * - Si la calculadora no puede utilizar número negativos, se deberá de modificar el código
     * para que rechace o salte un mensaje diciendo que dicha operación no es posible en caso de
     * insertar un negativo.
     * -
     * -
     */

}
