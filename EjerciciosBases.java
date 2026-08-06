/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbases;

import java.util.Scanner;

/**
 *
 * @author jy_ga
 */
public class EjerciciosBases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 digitos");
        int num = sc.nextInt();

        if (num < 100 && num < 999) {
            System.out.println("El numero no tiene 3 digitos");
        } else {
            int centenas = num / 100;
            int decenas = (num / 10) % 10;
            int unidades = num % 10;

            int mayor, medio, menor;
            if (centenas >= decenas && centenas >= unidades) {
                mayor = centenas;

                if (decenas >= unidades) {
                    medio = decenas;
                    menor = unidades;
                } else {
                    medio = unidades;
                    menor = decenas;
                }
            } else if (decenas >= centenas && decenas >= unidades){
                mayor=decenas;
                if(centenas >= unidades){
                    medio = centenas;
                    menor = unidades;
                } else {
                    medio = unidades;
                    menor = centenas;
                }
            } else {
                mayor=unidades;
                if (centenas >= decenas)    {
                    medio = centenas;
                    menor = decenas;
                    
                } else {
                    medio =decenas;
                    menor = centenas;
                }
            }
            int numMayor= mayor *100 + medio *10 + menor;
            System.out.println("el numero mas grande que se puede formar es: "+ numMayor);
            
        }

    }

}
