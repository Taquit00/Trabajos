/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

/**
 *
 * @author UIS
 */
public abstract class Empleado {
    private int idEmpleado;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direecion;

    public Empleado(int idempleado, String nombre, String apellidos, String telefono, String direecion) {
        this.idEmpleado = idempleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direecion = direecion;
    }
    
    public abstract void realizartarea();
        
        
    
    
}
    
    
    
 