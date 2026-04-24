package vista.view;

import java.awt.color.ProfileDataException;
import javax.swing.table.DefaultTableModel;
import vista.controller.CEstudiante;
import vista.controller.CMateria;
import vista.controller.CMatricular;
import vista.controller.CProfesor;
import vista.model.EstudianteDAO;
import vista.model.MateriaDAO;
import vista.model.ProfesorDAO;





public class ScreenManager {
    
public static void abrirMenu(){
    Principal menu = new Principal();
    menu.setVisible(true);
    menu.setLocationRelativeTo(null);
    menu.setTitle("Registro");
    }



    // Método para abrir la pantalla de Estudiantes
 public static void abrirEstudiantes(Principal menu) {
        // 1. CREAR OBJETOS: Aquí nacen los componentes
        VEstudiante1 vista = new VEstudiante1(menu);
        EstudianteDAO dao = new EstudianteDAO();

        
        // 2. CONECTAR: El controlador une la vistaprof con el dao
        // Guardamos la referencia del controlador para poder usarla luego
        CEstudiante Econtrolador = new CEstudiante(vista, dao);
        
        // 3. MOSTRAR: Configuración visual
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Gestión Académica ");
        menu.setVisible(false);
        
    }

  
 
 // Método para cerrar y eliminar objetos de forma segura
    public static void cerrarEstudiantes(CEstudiante Econtrolador) {
        if (Econtrolador != null) {
            // 1. LLAMAR A LA AUTO-DESTRUCCIÓN: 
            // El controlador sabe cómo limpiar sus propios cables
            Econtrolador.finalizar(); 
            
            // 2. ELIMINAR REFERENCIA:
            // Ayudamos al Garbage Collector de Java
            Econtrolador = null;
            
            System.out.println("Pantalla cerrada y objetos liberados.");
        }
    }
        // Método para abrir la pantalla de Estudiantes
 public static void abrirProfesores(Principal menu) {
        // 1. CREAR OBJETOS: Aquí nacen los componentes
        VProfesores vistaprof = new VProfesores(menu);
        ProfesorDAO daoprof = new ProfesorDAO();
        
        // 2. CONECTAR: El controlador une la vistaprof con el dao
        // Guardamos la referencia del controlador para poder usarla luego
        CProfesor Pcontrolador = new CProfesor(vistaprof, daoprof);
        
        // 3. MOSTRAR: Configuración visual
        vistaprof.setVisible(true);
        vistaprof.setLocationRelativeTo(null);
        vistaprof.setTitle("Gestión Académica ");
        menu.setVisible(false);
    }

  
 
 // Método para cerrar y eliminar objetos de forma segura
    public static void cerrarProfesores(CProfesor Pcontrolador) {
        if (Pcontrolador != null) {
            // 1. LLAMAR A LA AUTO-DESTRUCCIÓN: 
            // El controlador sabe cómo limpiar sus propios cables
            Pcontrolador.finalizar(); 
            
            // 2. ELIMINAR REFERENCIA:
            // Ayudamos al Garbage Collector de Java
            Pcontrolador = null;
            
            System.out.println("Pantalla cerrada y objetos liberados.");
        }
    }
    
public static void abrirMaterias(Principal menu){
    
    VMaterias vistamat = new VMaterias(menu);
    MateriaDAO daomat = new MateriaDAO();
    
    CMateria MControlador  = new CMateria(vistamat, daomat);
    
    vistamat.setVisible(true);
    vistamat.setLocationRelativeTo(null);
    vistamat.setTitle("Materias");
    menu.setVisible(false);
    }

  
 
 // Método para cerrar y eliminar objetos de forma segura
    public static void cerrarMaterias(CMateria MControlador) {
        if (MControlador != null) {
            // 1. LLAMAR A LA AUTO-DESTRUCCIÓN: 
            // El controlador sabe cómo limpiar sus propios cables
            MControlador.finalizar(); 
            
            // 2. ELIMINAR REFERENCIA:
            // Ayudamos al Garbage Collector de Java
            MControlador = null;
            
            System.out.println("Pantalla cerrada y objetos liberados.");
        }
    }
    public static void abrirMatricular(){
    Matricular vista = new Matricular();
    EstudianteDAO estDAO = new EstudianteDAO();
    MateriaDAO matDAO = new MateriaDAO(); 

    CMatricular controlador = new CMatricular(vista, estDAO, matDAO);

    vista.setVisible(true);
    vista.setLocationRelativeTo(null);
}

  
    }
    
}
