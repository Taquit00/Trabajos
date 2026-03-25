/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;


public class Gerente extends Empleado{
    String tituloprofe;

    public Gerente(String tituloprofe, int idempleado, String nombre, String apellidos, String telefono, String direecion) {
        super(idempleado, nombre, apellidos, telefono, direecion);
        this.tituloprofe = tituloprofe;
    }

    

    public void gestionarEmpleados() {
        System.out.println("Gestionando empleados...");
    }

    public void generarReportes() {
        System.out.println("Generando reportes...");
    }

    @Override
    public void realizartarea() {
        System.out.println("soy gerente");
    }
}
