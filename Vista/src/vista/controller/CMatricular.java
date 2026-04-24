package vista.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.model.Estudiante;
import vista.model.EstudianteDAO;
import vista.model.Materia;
import vista.view.Matricular;

public class CMatricular implements ActionListener {

    private Matricular vista;
    private EstudianteDAO dao;

    public CMatricular(Matricular vista, EstudianteDAO dao) {
        this.vista = vista;
        this.dao = dao;

        // Escuchar botón
        this.vista.getBtnMatricular().addActionListener(this);

        // Cargar combos al iniciar
        cargarEstudiantes();
        cargarMaterias();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnMatricular()) {
            matricular();
        }
    }

    // 🔥 MÉTODO PRINCIPAL
    private void matricular() {
        try {
            Estudiante est = (Estudiante) vista.getCbEstudiante().getSelectedItem();
            Materia mat = (Materia) vista.getCbMateriaE().getSelectedItem();

            if (est == null || mat == null) {
                JOptionPane.showMessageDialog(vista, "Seleccione estudiante y materia");
                return;
            }

            est.agregarMateria(mat);

            JOptionPane.showMessageDialog(vista, "Materia matriculada correctamente");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
        }
    }


    private void cargarEstudiantes() {
        vista.getCbEstudiante().removeAllItems();

        for (Estudiante e : dao.consultarTodos()) {
            vista.getCbEstudiante().addItem(e);
        }
    }


    private void cargarMaterias() {
        vista.getCbMateriaE().removeAllItems();

    }
}