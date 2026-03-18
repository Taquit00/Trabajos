/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciopractica;

import java.util.ArrayList;

public class Mascota {
    private int id;
    private String duenio;
    private String direccion;
    private String telefono;
    private ArrayList<Atencion> atenciones;

    public Mascota(int id, String duenio, String direccion, String telefono) {
        this.id = id;
        this.duenio = duenio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.atenciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void agregarAtencion(Atencion a) {
        atenciones.add(a);
    }

    public ArrayList<Atencion> getAtenciones() {
        return atenciones;
    }

    @Override
    public String toString() {
        return "Mascota: " + id + " - Dueño: " + duenio;
    }
}
