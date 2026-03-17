
package academico;

import java.util.ArrayList;

public class Materia {
    int id;
    String name;
    int creditos;
    
    ArrayList<Float>notas;

    public Materia(int id, String name, int creditos) {
        this.id = id;
        this.name = name;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", name=" + name + ", creditos=" + creditos + '}';
    }
    
    
}
