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
public class Surtido {
   private int idSurtido;
   private int idPedido;
   private Date fechaSurtido;


    public Surtido() {
    }

    public Surtido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Surtido(int idPedido, Date fechaSurtido) {
        this.idPedido = idPedido;
        this.fechaSurtido = fechaSurtido;
    }

    public Surtido(int idSurtido, int idPedido, Date fechaSurtido) {
        this.idSurtido = idSurtido;
        this.idPedido = idPedido;
        this.fechaSurtido = fechaSurtido;
    }

    public int getIdSurtido() {
        return idSurtido;
    }

    public void setIdSurtido(int idSurtido) {
        this.idSurtido = idSurtido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaSurtido() {
        return fechaSurtido;
    }

    public void setFechaSurtido(Date fechaSurtido) {
        this.fechaSurtido = fechaSurtido;
    }

    @Override
    public String toString() {
        return "Surtido{" + "idSurtido=" + idSurtido + ", idPedido=" + idPedido + ", fechaSurtido=" + fechaSurtido +  '}';
    }

}
