package vista.model;

public class Profesor {

    private String id;
    private String nombre;
    private String materia;

    public Profesor(String id, String nombre, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMateria() { return materia; }
}