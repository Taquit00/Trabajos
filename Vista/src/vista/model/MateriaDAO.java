package vista.model;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Programer
 */
public class MateriaDAO {
    
    
   //"base de datos" en memoria. 
    // Es static para que los datos se mantengan mientras la App esté abierta.
    private static List<Materia> listaMateria = new ArrayList<>();

    // MÉTODO: CREATE (Registrar)
    public boolean guardar(Materia mat) {
        try {
            return listaMateria.add(mat);
           
        } catch (Exception e) {
            System.err.println("Error al guardar: " + e.getMessage());
            return false;
        }
    }

    // MÉTODO: READ (Consultar todos)
    public List<Materia> consultarTodos() {
        return listaMateria;
    }

    // MÉTODO: DELETE (Eliminar por documento)
    public boolean eliminar(String documento) {
        for (int i = 0; i < listaMateria.size(); i++) {
            if (listaMateria.get(i).getId().equals(documento)) {
                listaMateria.remove(i);
                return true;
            }
        }
        return false;
    }

    // MÉTODO: READ (Buscar uno solo por documento)
    public Materia buscarPorDocumento(String documento) {
        for (Materia mat : listaMateria) {
            if (mat.getId().equals(documento)) {
                return mat;
            }
        }
        return null;
    }
    
    public boolean actualizarDatos(Materia matActualizado) {
    for (int i = 0; i < listaMateria.size(); i++) {
        // Buscamos al estudiante por su documento
        if (listaMateria.get(i).getId().equals(matActualizado.getId())) {
            
            // Reemplazamos el objeto viejo por el nuevo en esa misma posición
            listaMateria.set(i, matActualizado);
            return true; // Actualización exitosa
        }
    }
    return false; // No se encontró el estudiante para actualizar
    }
}
