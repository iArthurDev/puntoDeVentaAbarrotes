/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ldoar
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int idVenta;
    private int idProducto;
    private int cantidadVendida;
    private double subtotal;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public DetalleVenta(int idVenta, int idProducto, int cantidadVendida, double subtotal) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidadVendida = cantidadVendida;
        this.subtotal = subtotal;
    }

    public DetalleVenta(int idDetalleVenta, int idVenta, int idProducto, int cantidadVendida, double subtotal) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidadVendida = cantidadVendida;
        this.subtotal = subtotal;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", cantidadVendida=" + cantidadVendida + ", subtotal=" + subtotal + '}';
    }
    
}
