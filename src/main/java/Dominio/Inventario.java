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
public class Inventario {
    private int idInventario;
    private int idProducto;
    private int cantidadDisponible;
    private Date fechaModificacion;

    public Inventario() {
    }

    public Inventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public Inventario(int idProducto, int cantidadDisponible) {
        this.idProducto = idProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.fechaModificacion = new java.sql.Date(System.currentTimeMillis());
    }

    public Inventario(int idInventario, int idProducto, int cantidadDisponible) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.fechaModificacion = new java.sql.Date(System.currentTimeMillis());
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", idProducto=" + idProducto + ", cantidadDisponible=" + cantidadDisponible + ", fechaModificacion=" + fechaModificacion + '}';
    }
 
}
