import javabean.Division;
import javabean.Multiplicacion;
import javabean.Resta;
import javabean.Suma;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("¿Que calculo quieres hacer?");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- Division");
            System.out.println("5.- Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Suma.menu();
                    break;
                case 2:
                    Resta.menu();
                    break;
                case 3:
                    Multiplicacion.menu();
                    break;
                case 4:
                    Division.menu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + opc);
            }
        }while (opc != 5);
    }
}