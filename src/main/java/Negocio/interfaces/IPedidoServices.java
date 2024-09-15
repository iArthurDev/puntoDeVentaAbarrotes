/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio.interfaces;

import Dominio.Producto;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface IPedidoServices {
    
    public void insertProductosPedido(int idProveedor, List<Producto> productosSolicitados, List<Integer> cantidadesSolicitadas);
    
    public void realizarSurtido(int idPedido);
}
