/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescripts;


import java.util.Scanner;

public class Menus {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1: opcion1(); break;
                case 2: opcion2(); break;
                case 3: opcion3(); break;
                case 4: opcion4(); break;
                case 5: opcion5(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida ");
            }

        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Opcion 5");
        System.out.println("0. Salir");
    }

    public static int leerOpcion() {
        System.out.print("Seleccione: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public static void opcion1() {
        System.out.println("a");
    }

    public static void opcion2() {
        System.out.println("b");
    }

    public static void opcion3() {
        System.out.println("c");
    }

    public static void opcion4() {
        System.out.println("d");
    }

    public static void opcion5() {
        System.out.println("e");
    }
}
