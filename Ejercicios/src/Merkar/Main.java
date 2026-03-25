/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Proveedor p = new Proveedor(1233, "paco", 213213213);
        
        Producto p1r = new Producto(1233, "Smirnoff (Tamarindo)", "Licor", 5);
        Producto p2r = new Producto(5353, "Arroz", "kilo", 34);
        Producto p3r = new Producto(5763, "Queso", "Descremado", 102);
        
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(p1r);
        productos.add(p2r);
        productos.add(p3r);
        Administrador ad1 = new Administrador(1, 12314, "Juan", "Valdez", "3245314141", "calle 5 #5-02 ");
        
        Compra cr1 = new Compra(123, LocalDate.EPOCH, 0, p, productos, ad1);
        System.out.println(p.getNombre() + " " + p.getContacto()); 
        
    }
}