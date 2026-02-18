
/*
/**
 *
 * @author Jorge Olarte
 */
import javax.swing.JOptionPane;

//public class Ejercicios {

    /*public static void main(String[] args) {  //---------------Primer taller para revisar o usar eliminar el comentario---------------
        //sumanumeros();
        //promedio5();
        //Ponderadomateria();
        //promedioalgoritmos();
        //sueldotrabajador();
        //numeropar();
        //lee3numeros();
    }

    public static void sumanumeros() //Suma dos numeros y arroja el resultado
    { 

        int A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero al que desea sumar"));
        int total = A1 + A2;
        JOptionPane.showMessageDialog(null, total, "La suma de " + A1 + " + " + A2 + " =", 0);

    }

    public static void promedio5() //Promedio de 5 numeros
    {
        Float A1 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su primer numero"));
        Float A2 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su segundo numero"));
        Float A3 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su tercer numero"));
        Float A4 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su cuarto numero"));
        Float A5 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su quinto numero"));

        Number promedio = (A1 + A2 + A3 + A4 + A5) / 5;
        JOptionPane.showMessageDialog(null, promedio, "El promedio de los numeros establecidos es de : ", 0);
    }
    
//Halla el resultado de la materia o ponderado de notas
    public static void Ponderadomateria() 
    {
        Float parcial1 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota del Parcial 1"));
        Float parcial2 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota del Parcial 2"));
        Float parcial3 = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota del Parcial 3"));
        Float quizes = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota de quizes"));
        Float proyecto = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota de su proyecto"));

        Number total = (parcial1 * 0.2) + (parcial2 * 0.25) + (parcial3 * 0.25) + (quizes * 0.1) + (proyecto * 0.2);
        JOptionPane.showMessageDialog(null, total, "Su nota en la asignatura de programacion es: ", 0);
    }
    
//promedio de notas de clase
    public static void promedioalgoritmos() 
    {
        Float parciales = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota de sus Parciales"));
        Float quizes = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota de sus quizes"));
        Float trabajfinal = Float.valueOf(JOptionPane.showInputDialog("Ingrese su nota de su trabajo final"));

        Number total = (parciales * 0.55) + (quizes * 0.30) + (trabajfinal * 0.15);
        JOptionPane.showMessageDialog(null, total, "Su promedio final de la materia de algoritmos es: ", 0);
    }
    
//Calculo de sueldo de trabajor por horas
    public static void sueldotrabajador() 
    {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas en el mes:"));

        Float pagoPorHora = Float.valueOf(JOptionPane.showInputDialog("Ingrese el pago por hora:"));

        Float sueldoMensual = horasTrabajadas * pagoPorHora;

        JOptionPane.showMessageDialog(null, "Empleado: "
                + nombre + "\nHoras trabajadas: "
                + horasTrabajadas + "\nPago por hora: $"
                + pagoPorHora + "\nSueldo mensual: $"
                + sueldoMensual, "Resultado", 1);

    }
//Dice si es par o impar
    public static void numeropar() 
    {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es par", "Resultado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es impar", "Resultado", 1);
        }
    }
    
//Si dos numeros son la suma del tercero o de alguno de los ingresados
    public static void lee3numeros() 
    {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        String mensaje;

        // Verificar si uno es la suma de los otros dos
        if (num1 == num2 + num3) {
            mensaje = num1 + " es la suma de " + num2 + " + " + num3;
        } else if (num2 == num1 + num3) {
            mensaje = num2 + " es la suma de " + num1 + " + " + num3;
        } else if (num3 == num1 + num2) {
            mensaje = num3 + " es la suma de " + num1 + " + " + num2;
        } else {
            mensaje = "Ningun numero es la suma de los otros dos.";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }*/
//---------------Segundo taller---------------    
    public static void main(String[] args) {
        //Primerpunto();
        //Segundopunto();
        //Tercerpunto();  
        //Puntocuatro();
        //Puntocinco();
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
=======
        Segundopunto();


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
        
        // Determinar si es año bisiesto
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        
        // Determinar cantidad de días del mes
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
        
        // Calcular día siguiente
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
    public static void ejercicio3() {


    }
}


//