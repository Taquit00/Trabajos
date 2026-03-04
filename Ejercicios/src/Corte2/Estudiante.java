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

public class Estudiante {

    private String nombre;
    private Date fechaNacimiento;
    private float altura;
    private float peso;

    private Antecedente antecedente;
    private Condena condena;

    public Estudiante(String nombre, float altura, float peso) {
        this.nombre = nombre;
 
        this.altura = altura;
        this.peso = peso;
    }

    public void asignarAntecedente(Antecedente antecedente) {
        this.antecedente = antecedente;
    }

    public void asignarCondena(Condena condena) {
        this.condena = condena;
    }

    public void mostrarHistorial() {

        System.out.println("\n--- DATOS DE LA PERSONA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

        if (antecedente != null) {
            System.out.println("Antecedente: " + antecedente.getDescripcion());
        } else {
            System.out.println("No tiene antecedentes.");
        }

        if (condena != null) {
            System.out.println("Condena: " + condena.getDelito() +
                               " | Años: " + condena.getAños());
        } else {
            System.out.println("No tiene condena.");
        }
    }
}
    
