/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescripts;


//MENU PARA LA PERSONA, sirve para registrar, listar, buscar, eliminar
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Registropersona> personas = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1: registrarPersona(); break;
                case 2: listarPersonas(); break;
                case 3: buscarPersona(); break;
                case 4: eliminarPersona(); break;
                case 5: System.out.println("Opción libre (puedes usarla)"); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida ❌");
            }

        } while (opcion != 0);
    }

    // 📋 MENU
    public static void mostrarMenu() {
        System.out.println("\n===== MENU PERSONAS =====");
        System.out.println("1. Registrar persona");
        System.out.println("2. Listar personas");
        System.out.println("3. Buscar persona por ID");
        System.out.println("4. Eliminar persona");
        System.out.println("5. Extra");
        System.out.println("0. Salir");
    }

    public static int leerOpcion() {
        System.out.print("Seleccione: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    // ➕ REGISTRAR
    public static void registrarPersona() {
        System.out.println("\n--- Registrar Persona ---");

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        Registropersona p = new Registropersona(id, nombre, numero, direccion);
        personas.add(p);

        System.out.println("Persona registrada ✔");
    }

    // 📄 LISTAR
    public static void listarPersonas() {
        System.out.println("\n--- Lista de Personas ---");

        if (personas.isEmpty()) {
            System.out.println("No hay registros");
        } else {
            for (Registropersona p : personas) {
                System.out.println(p);
            }
        }
    }

    // 🔍 BUSCAR
    public static void buscarPersona() {
        System.out.print("Ingrese ID a buscar: ");
        int id = sc.nextInt();

        for (Registropersona p : personas) {
            if (p.toString().contains("ID: " + id)) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("No encontrada ❌");
    }

    // ❌ ELIMINAR
    public static void eliminarPersona() {
        System.out.print("Ingrese ID a eliminar: ");
        int id = sc.nextInt();

        for (Registropersona p : personas) {
            if (p.toString().contains("ID: " + id)) {
                personas.remove(p);
                System.out.println("Eliminada ✔");
                return;
            }
        }

        System.out.println("No encontrada ❌");
    }
}