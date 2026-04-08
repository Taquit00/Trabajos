package vista.model;

import java.util.ArrayList;
//DATA ACCES OBJECT
public class EstudianteDAO {

    private ArrayList<Estudiante> lista = new ArrayList<>();

    public void guardar(Estudiante e) {
        lista.add(e);
    }

    public Estudiante buscar(String id) {
        for (Estudiante e : lista) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public void modificar(Estudiante est) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(est.getId())) {
                lista.set(i, est);
            }
        }
    }

    public void eliminar(String id) {
        lista.removeIf(e -> e.getId().equals(id));
    }

    public ArrayList<Estudiante> listar() {
        return lista;
    }
}