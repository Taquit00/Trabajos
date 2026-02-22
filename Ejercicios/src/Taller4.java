import javax.swing.JOptionPane;

class Estudiante {
    String nombre;
    String telefono;
    Estudiante siguiente;

    Estudiante(String n, String t) {
        nombre = n;
        telefono = t;
        siguiente = null;
    }
}

class Persona {
    String cedula;
    int boletas;
    Persona siguiente;

    Persona(String c, int b) {
        cedula = c;
        boletas = b;
        siguiente = null;
    }
}

public class Taller4 {

    public static void main(String[] args) {

        //Ejercicio1();
        Ejercicio2();
    }
/*
    Primer ejercicio donde se puede registrar un estudiante y agregar su numero tambien consultar, 
    modificar el nombre y el telefono asi mismo eliminat y por ultimo imprimir un listado
    */

    public static void Ejercicio1() {

        Estudiante cabeza = null;
        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n"
                    + "1. Registrar estudiante\n"
                    + "2. Consultar estudiante\n"
                    + "3. Modificar nombre\n"
                    + "4. Modificar telefono\n"
                    + "5. Eliminar estudiante\n"
                    + "6. Imprimir listado\n"
                    + "7. Salir"));

            switch (opcion) {

                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String telefono = JOptionPane.showInputDialog("Telefono:");

                    Estudiante nuevo = new Estudiante(nombre, telefono);

                    if (cabeza == null)
                        cabeza = nuevo;
                    else {
                        Estudiante aux = cabeza;
                        while (aux.siguiente != null)
                            aux = aux.siguiente;
                        aux.siguiente = nuevo;
                    }

                    JOptionPane.showMessageDialog(null, "Registrado");
                    break;

                case 2:
                    String buscar = JOptionPane.showInputDialog("Nombre a buscar:");
                    Estudiante aux2 = cabeza;
                    boolean encontrado = false;

                    while (aux2 != null) {
                        if (aux2.nombre.equalsIgnoreCase(buscar)) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre: " + aux2.nombre +
                                    "\nTelefono: " + aux2.telefono);
                            encontrado = true;
                            break;
                        }
                        aux2 = aux2.siguiente;
                    }

                    if (!encontrado)
                        JOptionPane.showMessageDialog(null, "No encontrado");
                    break;

                case 3:
                    String viejo = JOptionPane.showInputDialog("Nombre actual:");
                    Estudiante aux3 = cabeza;

                    while (aux3 != null) {
                        if (aux3.nombre.equalsIgnoreCase(viejo)) {
                            aux3.nombre = JOptionPane.showInputDialog("Nuevo nombre:");
                            JOptionPane.showMessageDialog(null, "Actualizado");
                            break;
                        }
                        aux3 = aux3.siguiente;
                    }
                    break;

                case 4:
                    String nomTel = JOptionPane.showInputDialog("Nombre:");
                    Estudiante aux4 = cabeza;

                    while (aux4 != null) {
                        if (aux4.nombre.equalsIgnoreCase(nomTel)) {
                            aux4.telefono = JOptionPane.showInputDialog("Nuevo telefono:");
                            JOptionPane.showMessageDialog(null, "Telefono actualizado");
                            break;
                        }
                        aux4 = aux4.siguiente;
                    }
                    break;

                case 5:
                    String eliminar = JOptionPane.showInputDialog("Nombre a eliminar");

                    if (cabeza != null &&
                            cabeza.nombre.equalsIgnoreCase(eliminar)) {

                        cabeza = cabeza.siguiente;
                        JOptionPane.showMessageDialog(null, "Eliminado");
                        break;
                    }

                    Estudiante aux5 = cabeza;

                    while (aux5 != null && aux5.siguiente != null) {
                        if (aux5.siguiente.nombre.equalsIgnoreCase(eliminar)) {
                            aux5.siguiente = aux5.siguiente.siguiente;
                            JOptionPane.showMessageDialog(null, "Eliminado");
                            break;
                        }
                        aux5 = aux5.siguiente;
                    }
                    break;

                case 6:
                    if (cabeza == null)
                        JOptionPane.showMessageDialog(null, "Lista vacia");
                    else {
                        String lista = "LISTADO\n\n";
                        Estudiante aux6 = cabeza;

                        while (aux6 != null) {
                            lista += aux6.nombre + " - " + aux6.telefono + "\n";
                            aux6 = aux6.siguiente;
                        }

                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }

        } while (opcion != 7);
    }

/*
    Este ejercicio es una venta de boletas, donde maximo una persona puede comprar 4
    se pide la cedula de la persona y luego se solicita cuantas boletas quiere
    
    */
    public static void Ejercicio2() {

    Persona cabeza = null;
    int totalBoletas = 20;
    int vendidas = 0;
    int opcion;

    do {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "VENTA DE BOLETAS\n"
                + "Disponibles: " + totalBoletas + "\n\n"
                + "1. Comprar boleta\n"
                + "2. Salir"));

        switch (opcion) {

            case 1:

                if (totalBoletas == 0) {
                    JOptionPane.showMessageDialog(null, "Boletas agotadas");
                    break;
                }

                String cedula = JOptionPane.showInputDialog("Ingrese cedula:");

                Persona aux = cabeza;
                Persona encontrada = null;

                while (aux != null) {
                    if (aux.cedula.equals(cedula)) {
                        encontrada = aux;
                        break;
                    }
                    aux = aux.siguiente;
                }

                int cantidad = Integer.parseInt(
                        JOptionPane.showInputDialog("Cantidad de boletas (MAX 4 por persona):"));

                if (cantidad <= 0) {
                    JOptionPane.showMessageDialog(null, "Cantidad invalida");
                    break;
                }

                
                
                if (encontrada != null) {

                    int puedeComprar = 4 - encontrada.boletas;

                    if (puedeComprar == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Ya alcanzo el limite de 4 boletas");
                        break;
                    }

                    if (cantidad > puedeComprar) {
                        JOptionPane.showMessageDialog(null,
                                "Solo puede comprar " + puedeComprar + " boletas más");
                        cantidad = puedeComprar;
                    }
                }

                
                
                else {

                    if (cantidad > 4) {
                        JOptionPane.showMessageDialog(null,
                                "Maximo permitido 4 boletas");
                        cantidad = 4;
                    }

                    Persona nueva = new Persona(cedula, 0);

                    if (cabeza == null)
                        cabeza = nueva;
                    else {
                        Persona aux2 = cabeza;
                        while (aux2.siguiente != null)
                            aux2 = aux2.siguiente;
                        aux2.siguiente = nueva;
                    }

                    encontrada = nueva;
                }

                if (cantidad > totalBoletas)
                    cantidad = totalBoletas;

                // REALIZAR COMPRA
                encontrada.boletas += cantidad;
                vendidas += cantidad;
                totalBoletas -= cantidad;

                JOptionPane.showMessageDialog(null,
                        "Compra realizada\n"
                        + "Boletas compradas por esta persona: "
                        + encontrada.boletas
                        + "\nVendidas totales: " + vendidas
                        + "\nDisponibles: " + totalBoletas);

                if (totalBoletas == 0) {
                    JOptionPane.showMessageDialog(null, "BOLETAS AGOTADAS");
                    opcion = 2;
                }

                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Sistema finalizado");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }

    } while (opcion != 2);
}
}