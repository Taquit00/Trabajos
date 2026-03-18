/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciopractica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica();

        int opcion;

        do {
            System.out.println("\n=== CLINICA PATITAS SALUDABLES ===");
            System.out.println("1. Registrar veterinario");
            System.out.println("2. Registrar mascota");
            System.out.println("3. Listar veterinarios");
            System.out.println("4. Listar mascotas");
            System.out.println("5. Registrar atención");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Registrar Veterinario ---");
                    System.out.print("ID: ");
                    int idVet = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombreVet = sc.nextLine();

                    System.out.print("Dirección: ");
                    String dirVet = sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telVet = sc.nextLine();

                    clinica.registrarVeterinario(
                        new Veterinario(idVet, nombreVet, dirVet, telVet)
                    );
                    System.out.println("Veterinario registrado ");
                    break;

                case 2:
                    System.out.println("\n--- Registrar Mascota ---");
                    System.out.print("ID: ");
                    int idMasc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Dueño: ");
                    String duenio = sc.nextLine();

                    System.out.print("Dirección: ");
                    String dirMasc = sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telMasc = sc.nextLine();

                    clinica.registrarMascota(
                        new Mascota(idMasc, duenio, dirMasc, telMasc)
                    );
                    System.out.println("Mascota registrada ✔");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Veterinarios ---");
                    clinica.listarVeterinarios();
                    break;

                case 4:
                    System.out.println("\n--- Lista de Mascotas ---");
                    clinica.listarMascotas();
                    break;

                case 5:
                    System.out.println("\n--- Registrar Atención ---");

                    System.out.print("ID Mascota: ");
                    int idM = sc.nextInt();

                    System.out.print("ID Veterinario: ");
                    int idV = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();

                    clinica.registrarAtencion(idM, idV, desc, fecha);
                    System.out.println("Atención registrada ✔");
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida ❌");
            }

        } while (opcion != 0);

        sc.close();
    }
}
