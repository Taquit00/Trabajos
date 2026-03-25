/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merkar;

import java.util.Date;
import java.util.List;

public class Envio {
    private int idEnvio;
    private String empresaTransportadora;
    private Date fechaEstimadaDeLlegada;
    private double costoEnvio;
    private String direccion;
    private List<Compra> compras;

    public Envio(int idEnvio, String empresaTransportadora, Date fechaEstimadaDeLlegada,
                 double costoEnvio, String direccion, List<Compra> compras) {
        this.idEnvio = idEnvio;
        this.empresaTransportadora = empresaTransportadora;
        this.fechaEstimadaDeLlegada = fechaEstimadaDeLlegada;
        this.costoEnvio = costoEnvio;
        this.direccion = direccion;
        this.compras = compras;
    }
}
