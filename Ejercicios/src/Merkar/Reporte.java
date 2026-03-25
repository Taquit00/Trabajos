/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;


import java.util.Date;
import java.util.List;

public class Reporte {
    private String nombre;
    private Date fecha;
    private List<Venta> ventas;

    public Reporte(String nombre, Date fecha, List<Venta> ventas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ventas = ventas;
    }
}
