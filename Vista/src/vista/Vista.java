package vista;

import vista.model.*;
import vista.controller.CEstudiante;

public class Vista {

    public static void main(String[] args) {

        ProfesorDAO pdao = new ProfesorDAO();

        // Datos de prueba
        pdao.guardar(new Profesor("1", "Carlos", "Matematicas"));
        pdao.guardar(new Profesor("2", "Ana", "Fisica"));

        VEstudiante vista = new VEstudiante();
        CEstudiante cEstudiante = new CEstudiante(vista, pdao);

        vista.setVisible(true);
    }
}