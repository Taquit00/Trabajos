/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author UIS
 */
public class Compra {

    private int idCompra;
    private LocalDate fechaCompra;
    private float valorCompra;
    private Proveedor proveedor;
    private List<Producto> productos;
    private Administrador administrador;

    public Compra(int idCompra, LocalDate fechaCompra, float valorCompra, Proveedor proveedor, List<Producto> productos, Administrador administrador) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.valorCompra = valorCompra;
        this.proveedor = proveedor;
        this.productos = productos;
        this.administrador = administrador;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
}
