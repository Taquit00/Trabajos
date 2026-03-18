/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciopractica;


public class Veterinario {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Veterinario(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Veterinario: " + id + " - " + nombre + " - " + telefono;
    }
}
