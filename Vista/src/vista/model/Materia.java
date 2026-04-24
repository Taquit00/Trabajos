package vista.model;

public class Materia {
    private String id;
    private String nombre;
    private String creditos;

    public Materia() {}
    private Profesor profesor;
    
    public Materia(String id, String nombre, String creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // Getters y Setters

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

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
    @Override
public String toString() {
    return nombre;
}
}