/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

/**
 *
 * @author UIS
 */
public class Administrador extends Empleado{
    
    int nEmpleados;

    public Administrador(int nEmpleados, int idempleado, String nombre, String apellidos, String telefono, String direecion) {
        super(idempleado, nombre, apellidos, telefono, direecion);
        this.nEmpleados = nEmpleados;
    }
    
    

    public void registrarProductos() {
        System.out.println("Registrando productos...");
    }

    public void gestionarCompras() {
        System.out.println("Gestionando compras...");
    }

    public void gestionarVentas() {
        System.out.println("Gestionando ventas...");
    }

    @Override
    public void realizartarea() {
        System.out.println("Soy administrador");
    }
    
    
}
