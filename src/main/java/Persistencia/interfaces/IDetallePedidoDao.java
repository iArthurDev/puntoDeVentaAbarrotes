/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.DetallePedido;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface IDetallePedidoDao {
    
    public boolean insert(DetallePedido detalle);
    
    public List<DetallePedido> selectAll();
    
    public List<DetallePedido> selectAllByID(int idPedido);
    
    public DetallePedido selectByID(int idDetallePedido);
    
    public boolean update(DetallePedido detallePedido);
    
    public boolean delete(int idDetallaPedido);
}
