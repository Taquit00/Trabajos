/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

/**
 *
 * @author UIS
 */
public class Vendedor extends Empleado{
    
    int añosExp;

    public Vendedor(int añosExp, int idempleado, String nombre, String apellidos, String telefono, String direecion) {
        super(idempleado, nombre, apellidos, telefono, direecion);
        this.añosExp = añosExp;
    }
    
    

    public void registrarVentas() {
        System.out.println("Registrando ventas...");
    }

    @Override
    public void realizartarea() {
        System.out.println("Soy vendedor");
    }
}
