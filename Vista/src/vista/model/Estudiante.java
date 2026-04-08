package vista.model;

import java.util.ArrayList;

public class Estudiante {

    private String id, nombre, apellido;
    private ArrayList<Materia> materias;

    public Estudiante(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new ArrayList<>();
    }

    public Estudiante(String id, String nombre, String apellido, double promedio, Profesor prof) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public ArrayList<Materia> getMaterias() { return materias; }
}