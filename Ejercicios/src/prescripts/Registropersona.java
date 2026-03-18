/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescripts;

//Para registar personas u objetos
public class Registropersona {
    private int id;
    private String nombre;
    private String numero;
    private String direccion;

    public Persona(int id, String nombre, String numero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre +
               " | Número: " + numero + " | Dirección: " + direccion;
    }
}

