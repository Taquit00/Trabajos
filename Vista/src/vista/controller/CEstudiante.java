package vista.controller;

import vista.model.*;
import vista.view.VEstudiante;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CEstudiante implements ActionListener {

    private VEstudiante vista;
    private EstudianteDAO dao;
    private ProfesorDAO profesorDAO;

    public CEstudiante(VEstudiante vista, ProfesorDAO profesorDAO) {
        this.vista = vista;
        this.dao = new EstudianteDAO();
        this.profesorDAO = profesorDAO;

        this.vista.getBtnRegistrar().addActionListener(this);
        this.vista.getBtnBuscar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnAgregarProfesor().addActionListener(this);
        cargarTabla();
        cargarProfesores();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnRegistrar()) {
            registrar();
        }

        if (e.getSource() == vista.getBtnBuscar()) {
            buscar();
        }

        if (e.getSource() == vista.getBtnModificar()) {
            modificar();
        }

        if (e.getSource() == vista.getBtnEliminar()) {
            eliminar();
        }

       
        if (e.getSource() == vista.getBtnAgregarProfesor()) {
            registrarProfesor();
        }
    }

  
    private void registrar() {
        try {
            String id = vista.getTxtId().getText();
            String nombre = vista.getTxtNombre().getText();
            String apellido = vista.getTxtApellido().getText();
            String idProfesor = vista.getTxtProfesor().getText();
            double promedio = Double.parseDouble(vista.getTxtPromedio().getText());

            Profesor prof = profesorDAO.buscar(idProfesor);

            if (prof == null) {
                JOptionPane.showMessageDialog(null, "Profesor no existe");
                return;
            }

            Estudiante est = dao.buscar(id);

            if (est == null) {
                est = new Estudiante(id, nombre, apellido);
                dao.guardar(est);
            }


            Materia materia = new Materia(prof.getMateria(), promedio);
            est.agregarMateria(materia);

            JOptionPane.showMessageDialog(null, "Materia agregada al estudiante");
            cargarTabla();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private void buscar() {
        String id = vista.getTxtId().getText();
        Estudiante e = dao.buscar(id);

        if (e == null) {
            JOptionPane.showMessageDialog(null, "No encontrado");
            return;
        }

        vista.getTxtNombre().setText(e.getNombre());
        vista.getTxtApellido().setText(e.getApellido());
        vista.getTxtPromedio().setText(String.valueOf(e.getPromedio()));
        vista.getTxtProfesor().setText(e.getProfesor().getId());
    }

    private void modificar() {
        try {
            String id = vista.getTxtId().getText();
            String nombre = vista.getTxtNombre().getText();
            String apellido = vista.getTxtApellido().getText();
            String idProfesor = vista.getTxtProfesor().getText();
            double promedio = Double.parseDouble(vista.getTxtPromedio().getText());

            Profesor prof = profesorDAO.buscar(idProfesor);

            Estudiante est = new Estudiante(id, nombre, apellido, promedio, prof);
            dao.modificar(est);

            JOptionPane.showMessageDialog(null, "Modificado");
            cargarTabla();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private void eliminar() {
        String id = vista.getTxtId().getText();
        dao.eliminar(id);

        JOptionPane.showMessageDialog(null, "Eliminado");
        limpiar();
        cargarTabla();
    }

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla().getModel();
        modelo.setRowCount(0);

        for (Estudiante e : dao.listar()) {
            for (Materia m : e.getMaterias()) {
                modelo.addRow(new Object[]{
                    e.getId(),
                    e.getNombre(),
                    m.getNombre(),
                    m.getPromedio()
                });
            }
        }
    }

    private void limpiar() {
        vista.getTxtId().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtProfesor().setText("");
        vista.getTxtPromedio().setText("");
    }
    
    private void cargarProfesores() {
    vista.getComboProfesor().removeAllItems();

    for (Profesor p : profesorDAO.listar()) {
        vista.getComboProfesor().addItem(p.getId() + " - " + p.getMateria());
    }
}
    
    private void registrarProfesor() {

        JTextField txtId = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtMateria = new JTextField();

        Object[] mensaje = {
            "ID:", txtId,
            "Nombre:", txtNombre,
            "Materia:", txtMateria
        };

        int opcion = JOptionPane.showConfirmDialog(
                null,
                mensaje,
                "Agregar Profesor",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (opcion == JOptionPane.OK_OPTION) {

            String id = txtId.getText();
            String nombre = txtNombre.getText();
            String materia = txtMateria.getText();

            profesorDAO.guardar(new Profesor(id, nombre, materia));

            JOptionPane.showMessageDialog(null, "Profesor agregado");

            cargarProfesores();
        }

    }

}
