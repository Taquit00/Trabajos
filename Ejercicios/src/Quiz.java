
import javax.swing.JOptionPane;
//Quiz de jorge yesid olarte carreño 2255623
public class Quiz {

   // public static void main(String[] args) {

        String tipoProducto = JOptionPane.showInputDialog(
                "Ingrese el tipo de producto:\n comestible    vestuario    jugueteria"
        );

        double valorFinal = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor final del producto (con IVA):")
        );

        double porcentajeIVA = Double.parseDouble(
                JOptionPane.showInputDialog("Ingese el porcentaje de IVA:")
        );

        if (tipoProducto.equals("comestible")
                && porcentajeIVA >= 10 && porcentajeIVA <= 15) {

            double valorSinIVA = valorFinal / (1 + (porcentajeIVA / 100));

            JOptionPane.showMessageDialog(null,
                    "----- RESULTADO -----\n"
                    + "Tipo de producto: " + tipoProducto + "\n"
                    + "Valor final: $" + valorFinal + "\n"
                    + "IVA aplicado: " + porcentajeIVA + "%\n"
                    + "Valor sin IVA: $" + valorSinIVA);

        } else if (tipoProducto.equals("vestuario")
                && porcentajeIVA >= 16 && porcentajeIVA <= 20) {

            double valorSinIVA = valorFinal / (1 + (porcentajeIVA / 100));

            JOptionPane.showMessageDialog(null,
                    "----- RESULTADO -----\n"
                    + "Tipo de producto: " + tipoProducto + "\n"
                    + "Valor final: $" + valorFinal + "\n"
                    + "IVA aplicado: " + porcentajeIVA + "%\n"
                    + "Valor sin IVA: $" + valorSinIVA);

        } else if (tipoProducto.equals("jugueteria")
                && porcentajeIVA >= 7 && porcentajeIVA <= 9) {

            double valorSinIVA = valorFinal / (1 + (porcentajeIVA / 100));

            JOptionPane.showMessageDialog(null,
                    "----- RESULTADO -----\n"
                    + "Tipo de producto: " + tipoProducto + "\n"
                    + "Valor final: $" + valorFinal + "\n"
                    + "IVA aplicado: " + porcentajeIVA + "%\n"
                    + "Valor sin IVA: $" + valorSinIVA);

        } else if (!tipoProducto.equals("comestible")
                && !tipoProducto.equals("vestuario")
                && !tipoProducto.equals("jugueteria")) {

            JOptionPane.showMessageDialog(null, "Tipo de producto no valido.");

        } else {

            JOptionPane.showMessageDialog(null,
                    "El IVA no está dentro del rango permitido para este producto.");
        }
    }
}
