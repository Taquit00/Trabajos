/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciopractica;

public class Atencion {
    private Mascota mascota;
    private Veterinario veterinario;
    private String descripcion;
    private String fecha;

    public Atencion(Mascota mascota, Veterinario veterinario, String descripcion, String fecha) {
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Atención: " + descripcion + " - Fecha: " + fecha;
    }
}
