/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ldoar
 */
public class Producto {
    private int idProducto;
    private int idProveedor;
    private String upc;
    private String nombreProducto;
    private double precioVenta;
    private double precioCosto;
    private String disponibilidad;

    public Producto() {
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(int idProveedor, String upc, String nombreProducto, double precioVenta, double precioCosto, String disponibilidad) {
        this.idProveedor = idProveedor;
        this.upc = upc;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.disponibilidad = disponibilidad;
    }

    public Producto(int idProducto, int idProveedor, String upc, String nombreProducto, double precioVenta, double precioCosto, String disponibilidad) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.upc = upc;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.disponibilidad = disponibilidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", idProveedor=" + idProveedor + ", upc=" + upc + ", nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", precioCosto=" + precioCosto + ", disponibilidad=" + disponibilidad + '}';
    }
}
