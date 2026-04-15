public class Materia {
    private int id;
    private String nombre;
    private int creditos;
    private Profesor profesor;

    public Materia(int id, String nombre, int creditos, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public Profesor getProfesor() { return profesor; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}