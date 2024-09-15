/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.sql.Date;

/**
 *
 * @author ldoar
 */
public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private double total;
    private String estado;

    public Venta() {
    }

    public Venta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(Date fechaVenta, double total, String estado) {
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.estado = estado;
    }

    public Venta(int idVenta, Date fechaVenta, double total, String estado) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", total=" + total + ", estado=" + estado + '}';
    }
    
}
