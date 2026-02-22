
/*
/**
 *
 * @author Jorge Olarte
 */
import javax.swing.JOptionPane;

public class Ejercicios {

//---------------Segundo taller---------------    
    public static void main(String[] args) {
        Primerpunto();
        Segundopunto();
        Tercerpunto();  
        Puntocuatro();
        Puntocinco();
    }
//Si el numero es multiplo de 3 y esta entre 100 y 200

    public static void Primerpunto() {

        JOptionPane.showMessageDialog(null, "Determina si el numero ingresado a continuacion es digito de 3 y esta en el rango [100 y 200] ", "Digito de 3 y entre 100-200", 1);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        if (numero % 3 == 0 && numero > 100 && numero < 200) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 3 y está en el rango [100-200]", "Resultado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " No cumple con las condiciones", "Resultado", 1);
        }

    }
// leer la fecha de nacimiento de una persona y muestre su signo zodiacal.

    public static void Segundopunto() {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento (1-12):"));

        String signo = "";

        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Mes no válido");
            return;
        }

        int diasDelMes = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasDelMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasDelMes = 30;
                break;
            case 2:
                diasDelMes = 28;
                break;
        }

        if (dia < 1 || dia > diasDelMes) {
            JOptionPane.showMessageDialog(null, "Ese dia no existe en el mes ingresado");
            return;
        }

        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            signo = "Aries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            signo = "Tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            signo = "Geminis";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            signo = "Cancer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            signo = "Leo";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            signo = "Virgo";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            signo = "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            signo = "Escorpio";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            signo = "Sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            signo = "Capricornio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            signo = "Acuario";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            signo = "Piscis";
        }

        JOptionPane.showMessageDialog(null, "Su signo zodiacal es: " + signo);
    }

//Solicita el valor del producto, el valor del descuento y calcula el valor a pagar.
    public static void Tercerpunto() {
        double valorProducto = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor del producto:")
        );

        double descuento = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el porcentaje de descuento (%):")
        );

        double valorDescuento = valorProducto * (descuento / 100);

        double valorPagar = valorProducto - valorDescuento;

        JOptionPane.showMessageDialog(null,
                "Valor del producto: $" + valorProducto
                + "\nDescuento: " + descuento + "%"
                + "\nValor del descuento: $" + valorDescuento
                + "\nValor a pagar: $" + valorPagar);

    }
//Si el numero es multiplo de 3 y esta entre 100 y 200


//Halla el mayor de tres números y mostrar los tres organizados de menor a mayor.
    public static void Puntocuatro() {
        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el primer número:")
        );

        double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el segundo número:")
        );

        double num3 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el tercer número:")
        );

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        double menor, medio;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
            } else {
                medio = num3;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
            } else {
                medio = num3;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
            } else {
                medio = num2;
            }
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "El mayor es: " + mayor
                + "\nOrdenados de menor a mayor: "
                + menor + " - " + medio + " - " + mayor);
    }
    
 //    Solicitar una fecha y hallar el día posterior teniendo en cuenta la cantidad de días de cada mes y también tener en cuenta el cambio de año.
    public static void Puntocinco(){
        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el día:")
        );
        
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes (1-12):")
        );
        
        int año = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año:")
        );
        
        int diasMes = 0;
        

        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = esBisiesto ? 29 : 28;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mes inválido");
                return;
        }
        

        dia++;
        
        if (dia > diasMes) {
            dia = 1;
            mes++;
            
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        
        // Mostrar resultado
        JOptionPane.showMessageDialog(null,
                "El día siguiente es: " +
                dia + "/" + mes + "/" + año);
    }
}