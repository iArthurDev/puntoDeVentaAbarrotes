/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.Pedido;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface IPedidoDao {
    
    public boolean insert(Pedido pedido);
    
    public List<Pedido> selectAll();
    
    public List<Pedido> selectByName(String nombre);
    
    public Pedido selectByID(int idPedido);
    
    public Pedido selectLast();
    
    public boolean update(Pedido pedido);
    
    public boolean updateEstado(int idPedido, String estado);
    
    public boolean updateCantidadPedido(int idPedido, int cantidad);
    
    public boolean updateCosto(int idPedido, double costoPedido);
    
    public boolean delete(int idPedido);
   
}
