/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico1;

import academico.Estudiante;
import academico.Materia;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainacademico {
    
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante>estudiantes = null;
        ArrayList<Materia>materias = null;
        
        while (opcion !=6 ) {
            
            System.out.println("=====Menu=====");
            System.out.println("1. Registar estudiantes");
            System.out.println("2. Registrar materia");
            System.out.println("3. Registrar nota");
            System.out.println("4. Listar estudiantes");
            System.out.println("5. Mostrar promedio");
            System.out.println("6. Salir");
            
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                
                case 1 -> registrarEstudiante(estudiantes);
                case 2 -> registrarMateria(materias);
                case 3 -> registrarNota();
                case 4 -> listarEstudiantes(estudiantes);
                case 5 -> mostrarPromedio();
                default -> System.out.println("Opcion no valida, intente nuevamente.");
                    
                    
            }
                    
            }
        }
    
    public static void registrarEstudiante(ArrayList<Estudiante>estudiantes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Registro de Estudiante ===");
        System.out.print("Ingrese el ID: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese la direccion: ");
        String address = sc.nextLine();
        System.out.print("Ingrese el telefono: ");
        String phone = sc.nextLine();
        
        Estudiante d = new Estudiante(0, name, address, phone);
        
        estudiantes.add(d);
        
        System.out.println("Estudiante registrado correctamente.");
    
        
    }
    
    public static void registrarMateria(ArrayList<Materia>materias) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Registrar Materia ===");

        System.out.print("Ingrese el ID: ");
        String id = sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        int name = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ingrese los creditos: ");
        int creditos = sc.nextInt();

        Materia c = new Materia(name, id, creditos);
        
        materias.add(c);
        System.out.println("Materia registrada correctamente.");
    
    }
    
    public static void registrarNota() {
        
    }
    
    public static void listarEstudiantes(ArrayList<Estudiante>estudiantes) {
        
        System.out.println("=== Lista de estudiantes ===");
        
        for (Estudiante e : estudiantes) {
            
            System.out.println("ID: " + e.id());
            System.out.println("Nombre: " + e.name());
            System.out.println("Direccion: " + e.address());
            System.out.println("Telefono: " + e.phone());
            
            
        }
 {
            
        }
    }
    
    public static void mostrarPromedio() {
        
    }
}
        
