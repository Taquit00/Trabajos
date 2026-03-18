/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2;

/**
 *
 * @author UIS
 */
import java.util.Date;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la altura (ej: 1,75):");
        float altura = sc.nextFloat();

        System.out.println("Ingrese el peso:");
        float peso = sc.nextFloat();
        sc.nextLine(); // limpiar buffer

        Estudiante persona = new Estudiante(nombre, altura, peso);

        System.out.println("¿Tiene antecedente? (si/no)");
        String respAntecedente = sc.nextLine();

        if (respAntecedente.equalsIgnoreCase("si")) {
            System.out.println("Describa el antecedente:");
            String descripcion = sc.nextLine();
            Antecedente a = new Antecedente(descripcion);
            persona.asignarAntecedente(a);
        }

        System.out.println("¿Tiene condena? (si/no)");
        String respCondena = sc.nextLine();

        if (respCondena.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el delito:");
            String delito = sc.nextLine();

            System.out.println("Ingrese los años de condena:");
            int años = sc.nextInt();

            Condena c = new Condena(delito, años);
            persona.asignarCondena(c);
        }

        persona.mostrarHistorial();

        sc.close();
    }
}