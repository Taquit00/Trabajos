/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciopractica;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Mascota> mascotas;

    public Clinica() {
        veterinarios = new ArrayList<>();
        mascotas = new ArrayList<>();
    }

    // Registrar veterinario
    public void registrarVeterinario(Veterinario v) {
        veterinarios.add(v);
    }

    // Registrar mascota
    public void registrarMascota(Mascota m) {
        mascotas.add(m);
    }

    // Listar veterinarios
    public void listarVeterinarios() {
        for (Veterinario v : veterinarios) {
            System.out.println(v);
        }
    }

    // Listar mascotas con atenciones
    public void listarMascotas() {
        for (Mascota m : mascotas) {
            System.out.println(m);

            if (m.getAtenciones().isEmpty()) {
                System.out.println("  Sin atenciones");
            } else {
                for (Atencion a : m.getAtenciones()) {
                    System.out.println("  " + a);
                }
            }
        }
    }

    // Buscar mascota por ID
    public Mascota buscarMascota(int id) {
        for (Mascota m : mascotas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    // Buscar veterinario por ID
    public Veterinario buscarVeterinario(int id) {
        for (Veterinario v : veterinarios) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    // Registrar atención
    public void registrarAtencion(int idMascota, int idVet, String desc, String fecha) {
        Mascota m = buscarMascota(idMascota);
        Veterinario v = buscarVeterinario(idVet);

        if (m != null && v != null) {
            Atencion a = new Atencion(m, v, desc, fecha);
            m.agregarAtencion(a);
        } else {
            System.out.println("Mascota o veterinario no encontrado");
        }
    }
}