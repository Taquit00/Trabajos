import java.util.*;

public class MateriaDAO {
    private List<Materia> lista = new ArrayList<>();

    public void agregar(Materia m) { lista.add(m); }

    public List<Materia> listar() { return lista; }

    public void eliminar(int id) {
        lista.removeIf(m -> m.getId() == id);
    }

    public Materia buscar(int id) {
        return lista.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    public void actualizar(Materia nueva) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == nueva.getId()) {
                lista.set(i, nueva);
            }
        }
    }
}