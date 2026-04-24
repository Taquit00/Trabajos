package vista.model;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
    
    private String id; 
    private String nombre;
    private String apellido;
    private List<Materia> materias;
    public Estudiante() {
    }
    public void agregarMateria(Materia m){
    materias.add(m);
}

    public List<Materia> getMaterias(){
    return materias;
    }
    
    public Estudiante(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    


    
    
    
    
}
