package vista.model;

import java.util.ArrayList;

public class ProfesorDAO {

    private ArrayList<Profesor> lista = new ArrayList<>();

    public void guardar(Profesor p) {
        lista.add(p);
    }

    public Profesor buscar(String id) {
        for (Profesor p : lista) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}