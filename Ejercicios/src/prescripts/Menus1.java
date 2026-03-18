/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescripts;

//MENU MAS SIMPLE
import java.util.Scanner;

public class Menus1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Opción 5");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando opción 1...");
                    break;

                case 2:
                    System.out.println("Ejecutando opción 2...");
                    break;

                case 3:
                    System.out.println("Ejecutando opción 3...");
                    break;

                case 4:
                    System.out.println("Ejecutando opción 4...");
                    break;

                case 5:
                    System.out.println("Ejecutando opción 5...");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida ❌");
            }

        } while (opcion != 0);

        sc.close();
    }
}
