
package Merkar;

import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private List<Producto> productos;
    private Cliente cliente;
    private double valor;
    private Date fechaVenta;
    private Vendedor vendedor;

    public Venta(int idVenta, List<Producto> productos, Cliente cliente,
                 double valor, Date fechaVenta, Vendedor vendedor) {
        this.idVenta = idVenta;
        this.productos = productos;
        this.cliente = cliente;
        this.valor = valor;
        this.fechaVenta = fechaVenta;
        this.vendedor = vendedor;
    }
}
