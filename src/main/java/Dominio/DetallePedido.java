/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ldoar
 */
public class DetallePedido {
    private int idDetallePedido;
    private int idPedido;
    private int idProducto;
    private int cantidadPedida;

    public DetallePedido() {
    }

    public DetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public DetallePedido(int idPedido, int idProducto, int cantidadPedida) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadPedida = cantidadPedida;
    }

    public DetallePedido(int idDetallePedido, int idPedido, int idProducto, int cantidadPedida) {
        this.idDetallePedido = idDetallePedido;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadPedida = cantidadPedida;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetallePedido=" + idDetallePedido + ", idPedido=" + idPedido + ", idProducto=" + idProducto + ", cantidadPedida=" + cantidadPedida + '}';
    }
  
}
