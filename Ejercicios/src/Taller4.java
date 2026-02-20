
import javax.swing.JOptionPane;


public class Taller4 {
    public static void main(String[] args) {
        ejercicio3();
    }
        public static void ejercicio3() {
        int maxEstudiantes = 100; 
        String[] nombres = new String[maxEstudiantes];
        double[][] numero = new double[maxEstudiantes][3]; 
        int contador = 0; 
        int opcion = 0;

        while (opcion != 5) {
            String input = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                    "1 - Registrar estudiante\n" +
                    "2 - Consultar estudiante\n" +
                    "3 - Modificar nombre estudiante\n" +
                    "4 - Modificar teléfono estudiante\n" +
                    "5 - Eliminar estudiante" +
                    "6 - Imprimir listado" +
                    "7 - Salir"
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
    }

