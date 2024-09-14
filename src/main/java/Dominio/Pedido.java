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
public class Pedido {
    private int idPedido;
    private int idProveedor;
    private double costoPedido;
    private Date fechaPedido;
    private String estado;

    public Pedido() {
    }

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(int idProveedor, double costoPedido, Date fechaPedido, String estado) {
        this.idProveedor = idProveedor;
        this.costoPedido = costoPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
    }

    public Pedido(int idPedido, int idProveedor, double costoPedido, Date fechaPedido, String estado) {
        this.idPedido = idPedido;
        this.idProveedor = idProveedor;
        this.costoPedido = costoPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getCostoPedido() {
        return costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this.costoPedido = costoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", idProveedor=" + idProveedor + ", costoPedido=" + costoPedido + ", fechaPedido=" + fechaPedido + ", estado=" + estado + '}';
    }


}
