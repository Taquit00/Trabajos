package vista.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.model.Materia;
import vista.model.MateriaDAO;
import vista.model.Profesor;
import vista.view.ScreenManager;
import vista.view.VMaterias;

/**
 *
 * @author Programer
 */
public class CMateria implements ActionListener{
    
    
    // Referencias a la Vista y al DAO
    public VMaterias vistamat;
    public MateriaDAO daomat;

    // El constructor une las piezas
    public CMateria(VMaterias vistamat, MateriaDAO daomat) {
        this.vistamat = vistamat;
        this.daomat = daomat;

        // "Activamos" los botones para que el controlador lo escuche
        this.vistamat.getBtnRegistrarMate().addActionListener(this);
        this.vistamat.getBtnBuscarMate().addActionListener(this);
        this.vistamat.getBtnModificarMate().addActionListener(this);
        this.vistamat.getBtnEliminarMate().addActionListener(this);
        
        // Escuchador para la "X" de la ventana
        // se debe cambiar desde las propiedades del frame el defaultCloseOperation. Cámbiarlo a DO_NOTHING_ON_CLOSE.
    this.vistamat.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            // Cuando el usuario presiona la X, llamamos al manejador
            // Usamos CEstudiante.this para referirnos a este controlador
            ScreenManager.cerrarMaterias(CMateria.this);
        }
    });
        
        
        // CARGA INICIAL: Llenamos la tabla apenas se crea el controlador
        llenarTabla();
       
    }

    //  Este método se ejecuta automáticamente al hacer clic en el botón
    @Override
    public void actionPerformed(ActionEvent e) {
       //  Identificar qué botón disparó el evento
        if (e.getSource() == vistamat.getBtnRegistrarMate()) {
            registrar();
        } else if (e.getSource() == vistamat.getBtnBuscarMate()) {
            consultar();
        } else if (e.getSource() == vistamat.getBtnModificarMate()) {
            actualizar();
        } else if (e.getSource() == vistamat.getBtnEliminarMate()) {
            eliminar();
        }
    }

    
private void registrar() {
        try {
            Materia mat = capturarDatos();
            if (daomat.guardar(mat)) {
                JOptionPane.showMessageDialog(vistamat, "Materia guardada.");
               llenarTabla();
                limpiarCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistamat, "Error en datos: " + ex.getMessage());
        }
    }

    private void consultar() {
        String doc = vistamat.getTxtCodigoMate().getText();
        Materia mat = (Materia) daomat.buscarPorDocumento(doc);
        
        if (mat != null) {
            // Llenamos los campos de la vista con lo que encontró el DAO
            vistamat.getTxtCodigoMate().setText(mat.getId());
            vistamat.getTxtMateria().setText(mat.getNombre());
            vistamat.getTxtCreditos().setText(String.valueOf(mat.getCreditos()));
        } else {
            JOptionPane.showMessageDialog(vistamat, "Estudiante no encontrado.");
        }
    }

    private void actualizar() {
        String doc = vistamat.getTxtCodigoMate().getText();
        try {
            // Creamos un objeto con los nuevos datos de los campos
            Materia actualizado = capturarDatos();
           
            // El DAO busca el existente y reemplaza sus datos
            if (daomat.actualizarDatos(actualizado)) {
                JOptionPane.showMessageDialog(vistamat, "actualizado con éxito.");
                 llenarTabla();
            } else {
                JOptionPane.showMessageDialog(vistamat, "No se pudo actualizar.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistamat, "Error al actualizar.");
        }
    }

    private void eliminar() {
        String doc = vistamat.getTxtCodigoMate().getText();
        if (daomat.eliminar(doc)) {
            JOptionPane.showMessageDialog(vistamat, "Materia eliminada.");
            limpiarCampos();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(vistamat, "No se encontró el registro.");
        }
    }
    
    
    public void llenarTabla() {
        //  Obtener el modelo de la tabla de la vista
        DefaultTableModel modeloTabla = (DefaultTableModel) vistamat.getjTableMate().getModel();
        
        
        //  Limpiar la tabla para evitar datos duplicados
        modeloTabla.setRowCount(0);

        //  Pedir la lista de estudiantes al DAO
        List<Materia> lista = daomat.consultarTodos();

        //  Recorrer la lista y agregar cada estudiante como una fila
        Object[] fila = new Object[4]; // 4 columnas: Doc, Nombre, Apellido, Nota
        for (Materia mat : lista) {
            fila[0] = mat.getId();
            fila[1] = mat.getNombre();
            fila[2] = mat.getCreditos();
            modeloTabla.addRow(fila);
        }
    }
    
    
    // --- MÉTODOS AUXILIARES ---

    private Materia capturarDatos() {
        return new Materia(
            vistamat.getTxtCodigoMate().getText(),
            vistamat.getTxtMateria().getText(),
            vistamat.getTxtCreditos().getText()
        );
    
    
    }
        

    private void limpiarCampos() {
        vistamat.getTxtCodigoMate().setText("");
        vistamat.getTxtMateria().setText("");
        vistamat.getTxtCreditos().setText("");
    }
    
    
    
    public void finalizar() {
    // Romper el vínculo con la vista
    this.vistamat.dispose();
    
    // Limpiar las variables internas
    this.vistamat = null;
    this.daomat = null; 
    
    System.out.println("Controlador y referencias liberadas.");
}
}
