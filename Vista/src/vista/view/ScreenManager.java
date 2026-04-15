package vista.view;

import vista.controller.Controlador;
import vista.model.EstudianteDAO;




public class ScreenManager {
    
public static void abrirMenu(){
    Principal menu = new Principal();
    
    menu.setVisible(true);
    menu.setLocationRelativeTo(null);
    menu.setTitle("Registro");
}
  
    
    // Método para abrir la pantalla de Estudiantes
 public static void abrirEstudiantes() {
        // 1. CREAR OBJETOS: Aquí nacen los componentes
        VEstudiante1 vista = new VEstudiante1();
        EstudianteDAO dao = new EstudianteDAO();
        
        // 2. CONECTAR: El controlador une la vista con el dao
        // Guardamos la referencia del controlador para poder usarla luego
        Controlador controlador = new Controlador(vista, dao);
        
        // 3. MOSTRAR: Configuración visual
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Gestión Académica ");
    }

  
 
 // Método para cerrar y eliminar objetos de forma segura
    public static void cerrarEstudiantes(Controlador controlador) {
        if (controlador != null) {
            // 1. LLAMAR A LA AUTO-DESTRUCCIÓN: 
            // El controlador sabe cómo limpiar sus propios cables
            controlador.finalizar(); 
            
            // 2. ELIMINAR REFERENCIA:
            // Ayudamos al Garbage Collector de Java
            controlador = null;
            
            System.out.println("Pantalla cerrada y objetos liberados.");
        }
    }
    
   
   
}
