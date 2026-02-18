
import javax.swing.JOptionPane;

public class Taller3 {

    public static void main(String[] args) {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //prueba();
       
    }

    
    /*public static void prueba() {//Cuantas posibilidades hay de botones
        String[] opciones = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","q","t","u","w","x","y","z"};
        double x = JOptionPane.showOptionDialog(null, "seleccione", "titulo", 1, JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
        String[] input = {"a","b};
        double x = JOptionPane.showOptionDialog(null, "seleccione", "titulo", 1, JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
        */
        
    }
    public static void ejercicio1() {
        int opcion = -1;
        String[] opciones = {"Saludar", "Despedirse", "Salir"};
        while (opcion != 2) {
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú de Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            if (opcion == -1){
                break;
            }
            switch (opcion){
                case 0 -> JOptionPane.showMessageDialog(null, "Holaaa :)");
                case 1 -> JOptionPane.showMessageDialog(null, "Adios :(");
                case 2 -> JOptionPane.showMessageDialog(null, "Saliendo . . .");
                default -> JOptionPane.showMessageDialog(null, "Opcion no valida intente de nuevo");
                    
            }
        }
    }


    public static void ejercicio2() {
        int opcion = 0;
        while (opcion != 5) {
            String input;
            input = JOptionPane.showInputDialog("""
                                            Seleccione una opcion:
                                            1 - Calcular área del cuadrado 
                                            2 - Calcular área del círculo
                                            3 - Calcular área del triángulo
                                            4 - Calcular área del rectángulo
                                            5 - Salir""");
            if (input == null) {
                break;
            }

            try {
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1 -> {
                        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
                        double areaCuadrado = lado * lado;
                        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + areaCuadrado);

                    }
                    case 2 -> {
                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo:"));
                        double areaCirculo = Math.PI * radio * radio;
                        JOptionPane.showMessageDialog(null, "El area del circulo es: " + areaCirculo);
                    }
                    case 3 -> {

                        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo:"));
                        double h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo:"));
                        double areaTriangulo = (h * base) / 2;
                        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + areaTriangulo);

                    }
                    case 4 -> {
                        double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo:"));
                        double largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del rectangulo:"));
                        double areaRectangulo = ancho * largo;
                        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + areaRectangulo);
                    }
                    case 5 ->
                        JOptionPane.showMessageDialog(null, "Saliendo. . .");
                    default ->
                        JOptionPane.showMessageDialog(null, "Opción no valida, intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido.");
            }
        }
    }


    public static void ejercicio3() {
        int maxEstudiantes = 100; // Tamaño máximo del arreglo
        String[] nombres = new String[maxEstudiantes];
        double[][] notas = new double[maxEstudiantes][3]; // 0: Matemáticas, 1: Inglés, 2: Español
        int contador = 0; // Contador de estudiantes registrados
        int opcion = 0;

        while (opcion != 5) {
            String input = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                    "1 - Registrar notas\n" +
                    "2 - Calcular promedio por materia\n" +
                    "3 - Calcular promedio total del curso\n" +
                    "4 - Mostrar estudiantes aprobados y reprobados\n" +
                    "5 - Salir"
            );

            if (input == null) break; // Si presiona Cancelar

            try {
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1: // Registrar notas
                        if (contador >= maxEstudiantes) {
                            JOptionPane.showMessageDialog(null, "Se ha alcanzado el máximo de estudiantes.");
                            break;
                        }

                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                        double mat = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de Matemáticas:"));
                        double ing = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de Inglés:"));
                        double esp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de Español:"));

                        nombres[contador] = nombre;
                        notas[contador][0] = mat;
                        notas[contador][1] = ing;
                        notas[contador][2] = esp;
                        contador++; // Aumenta el contador

                        JOptionPane.showMessageDialog(null, "Estudiante registrado correctamente.");
                        break;

                    case 2: // Promedio por materia
                        if (contador == 0) {
                            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                            break;
                        }

                        double sumaMat = 0, sumaIng = 0, sumaEsp = 0;
                        for (int i = 0; i < contador; i++) {
                            sumaMat += notas[i][0];
                            sumaIng += notas[i][1];
                            sumaEsp += notas[i][2];
                        }

                        JOptionPane.showMessageDialog(null,
                                "Promedios por materia:\n" +
                                "Matemáticas: " + (sumaMat / contador) + "\n" +
                                "Inglés: " + (sumaIng / contador) + "\n" +
                                "Español: " + (sumaEsp / contador)
                        );
                        break;

                    case 3: // Promedio total del curso
                        if (contador == 0) {
                            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                            break;
                        }

                        double sumaTotal = 0;
                        for (int i = 0; i < contador; i++) {
                            sumaTotal += notas[i][0] + notas[i][1] + notas[i][2];
                        }

                        double promedioTotal = sumaTotal / (contador * 3);
                        JOptionPane.showMessageDialog(null, "Promedio total del curso: " + promedioTotal);
                        break;

                    case 4: // Mostrar aprobados y reprobados
                        if (contador == 0) {
                            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                            break;
                        }

                        String aprobados = "";
                        String reprobados = "";
                        for (int i = 0; i < contador; i++) {
                            double promedio = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
                            if (promedio >= 3.2) {
                                aprobados += nombres[i] + " (Promedio: " + promedio + ")\n";
                            } else {
                                reprobados += nombres[i] + " (Promedio: " + promedio + ")\n";
                            }
                        }

                        JOptionPane.showMessageDialog(null,
                                "Estudiantes aprobados:\n" + (aprobados.isEmpty() ? "Ninguno" : aprobados) +
                                        "\nEstudiantes reprobados:\n" + (reprobados.isEmpty() ? "Ninguno" : reprobados)
                        );
                        break;

                    case 5: // Salir
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
            }
        }
}

