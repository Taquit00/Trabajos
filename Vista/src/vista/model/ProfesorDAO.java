import java.util.*;

public class ProfesorDAO {
    private List<Profesor> lista = new ArrayList<>();

    public void agregar(Profesor p) { lista.add(p); }

    public List<Profesor> listar() { return lista; }

    public void eliminar(int id) {
        lista.removeIf(p -> p.getId() == id);
    }

    public Profesor buscar(int id) {
        return lista.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void actualizar(Profesor nuevo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == nuevo.getId()) {
                lista.set(i, nuevo);
            }
        }
    }
}