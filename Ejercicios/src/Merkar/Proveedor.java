/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;


public class Proveedor {
    private int idproveedor;
    private String nombre;
    private int contacto;

    public Proveedor(int idproveedor, String nombre, int contacto) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idproveedor=" + idproveedor +
                ", nombre='" + nombre + '\'' +
                ", contacto=" + contacto +
                '}';
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
}
