package vista.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.model.Profesor;
import vista.model.ProfesorDAO;
import vista.view.ScreenManager;

import vista.view.VProfesores;


public class CProfesor implements ActionListener{
    
    
    // Referencias a la Vista y al DAO
    private VProfesores vistaprof;
    private ProfesorDAO daoprof;

    // El constructor une las piezas
    public CProfesor(VProfesores vista, ProfesorDAO dao) {
        this.vistaprof = vista;
        this.daoprof = dao;

        // "Activamos" los botones para que el controlador lo escuche
        this.vistaprof.getBtnRegistrarProf().addActionListener(this);
        this.vistaprof.getBtnBuscarProf().addActionListener(this);
        this.vistaprof.getBtnModificarProf().addActionListener(this);
        this.vistaprof.getBtnEliminarProf().addActionListener(this);
        
        // Escuchador para la "X" de la ventana
        // se debe cambiar desde las propiedades del frame el defaultCloseOperation. Cámbiarlo a DO_NOTHING_ON_CLOSE.
    this.vistaprof.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            // Cuando el usuario presiona la X, llamamos al manejador
            // Usamos CEstudiante.this para referirnos a este controlador
            ScreenManager.cerrarProfesores(CProfesor.this);
        }
    });
        
        
        // CARGA INICIAL: Llenamos la tabla apenas se crea el controlador
        llenarTabla();
       
    }

    //  Este método se ejecuta automáticamente al hacer clic en el botón
    @Override
    public void actionPerformed(ActionEvent e) {
       //  Identificar qué botón disparó el evento
        if (e.getSource() == vistaprof.getBtnRegistrarProf()) {
            registrar();
        } else if (e.getSource() == vistaprof.getBtnBuscarProf()) {
            consultar();
        } else if (e.getSource() == vistaprof.getBtnModificarProf()) {
            actualizar();
        } else if (e.getSource() == vistaprof.getBtnEliminarProf()) {
            eliminar();
        }
    }

    
private void registrar() {
        try {
            Profesor prof = capturarDatos();
            if (daoprof.guardar(prof)) {
                JOptionPane.showMessageDialog(vistaprof, "Profesor guardado.");
               llenarTabla();
                limpiarCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaprof, "Error en datos: " + ex.getMessage());
        }
    }

    private void consultar() {
        String doc = vistaprof.getTxtIdProf().getText();
        Profesor prof = (Profesor) daoprof.buscarPorDocumento(doc);
        
        if (prof != null) {
            // Llenamos los campos de la vistaprof con lo que encontró el DAO
            vistaprof.getTxtNombreProf().setText(prof.getNombre());
            vistaprof.getTxtApellidoProf().setText(prof.getApellido());
        } else {
            JOptionPane.showMessageDialog(vistaprof, "Profesor no encontrado.");
        }
    }

    private void actualizar() {
        String doc = vistaprof.getTxtIdProf().getText();
        try {
            // Creamos un objeto con los nuevos datos de los campos
            Profesor actualizado = capturarDatos();
           
            // El DAO busca el existente y reemplaza sus datos
            if (daoprof.actualizarDatos(actualizado)) {
                JOptionPane.showMessageDialog(vistaprof, "actualizado con éxito.");
                 llenarTabla();
            } else {
                JOptionPane.showMessageDialog(vistaprof, "No se pudo actualizar.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaprof, "Error al actualizar.");
        }
    }

    private void eliminar() {
        String doc = vistaprof.getTxtIdProf().getText();
        if (daoprof.eliminar(doc)) {
            JOptionPane.showMessageDialog(vistaprof, "Profesor eliminado.");
            limpiarCampos();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(vistaprof, "No se encontró el registro.");
        }
    }
    
    
    public void llenarTabla() {
        //  Obtener el modelo de la tabla de la vistaprof
        DefaultTableModel modeloTabla = (DefaultTableModel) vistaprof.getTablaProf().getModel();
        
        
        //  Limpiar la tabla para evitar datos duplicados
        modeloTabla.setRowCount(0);

        //  Pedir la lista de estudiantes al DAO
        List<Profesor> lista = daoprof.consultarTodos();

        //  Recorrer la lista y agregar cada estudiante como una fila
        Object[] fila = new Object[4]; // 4 columnas: Doc, Nombre, Apellido, Nota
        for (Profesor prof : lista) {
            fila[0] = prof.getId();
            fila[1] = prof.getNombre();
            fila[2] = prof.getApellido();
            modeloTabla.addRow(fila);
        }
    }
    
    
    // --- MÉTODOS AUXILIARES ---

    private Profesor capturarDatos() {
        // Extrae los datos de la vistaprof y crea el objeto
        return new Profesor(
            vistaprof.getTxtIdProf().getText(),
            vistaprof.getTxtNombreProf().getText(),
            vistaprof.getTxtApellidoProf().getText()
        );
    }

    private void limpiarCampos() {
        vistaprof.getTxtIdProf().setText("");
        vistaprof.getTxtNombreProf().setText("");
        vistaprof.getTxtApellidoProf().setText("");
        vistaprof.getTxtIdProf().requestFocus();
    }
    
    
    
    public void finalizar() {
    // Romper el vínculo con la vistaprof
    this.vistaprof.dispose();
    
    // Limpiar las variables internas
    this.vistaprof = null;
    this.daoprof = null; 
    
    System.out.println("Controlador y referencias liberadas.");
}
    
}
