package vista.model;


import java.util.ArrayList;
import java.util.List;
import vista.model.Profesor;

/**
 *
 * @author Programer
 */
public class ProfesorDAO {
    
    
   //"base de datos" en memoria. 
    // Es static para que los datos se mantengan mientras la App esté abierta.
    private static List<Profesor> listaProfesores = new ArrayList<>();

    // MÉTODO: CREATE (Registrar)
    public boolean guardar(Profesor prof) {
        try {
            return listaProfesores.add(prof);
           
        } catch (Exception e) {
            System.err.println("Error al guardar: " + e.getMessage());
            return false;
        }
    }

    // MÉTODO: READ (Consultar todos)
    public List<Profesor> consultarTodos() {
        return listaProfesores;
    }

    // MÉTODO: DELETE (Eliminar por documento)
    public boolean eliminar(String documento) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).getId().equals(documento)) {
                listaProfesores.remove(i);
                return true;
            }
        }
        return false;
    }

    // MÉTODO: READ (Buscar uno solo por documento)
    public Profesor buscarPorDocumento(String documento) {
        for (Profesor prof : listaProfesores) {
            if (prof.getId().equals(documento)) {
                return prof;
            }
        }
        return null;
    }
    
    public boolean actualizarDatos(Profesor ProfActualizado) {
    for (int i = 0; i < listaProfesores.size(); i++) {
        // Buscamos al estudiante por su documento
        if (listaProfesores.get(i).getId().equals(ProfActualizado.getId())) {
            
            // Reemplazamos el objeto viejo por el nuevo en esa misma posición
            listaProfesores.set(i, ProfActualizado);
            return true; // Actualización exitosa
        }
    }
    return false; // No se encontró el estudiante para actualizar
    }
    

}
