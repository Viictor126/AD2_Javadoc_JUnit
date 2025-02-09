import javabean.Resta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opc;
        do {
            System.out.println("1.- Retsa");
            System.out.println("4.- Salir");
            
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Resta.menu();
                    break;
                case 4:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + opc);
            }
        }while (opc != 4);

main
    }
