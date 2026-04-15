
import java.util.List;


public class Profesor {
    private final int id;
    private String nombre;
    private List<Materia> materias;

    public Profesor(int id, String nombre, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Materia> getMaterias() { return materias; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMaterias(List<Materia> materias) { this.materias = materias; }
}