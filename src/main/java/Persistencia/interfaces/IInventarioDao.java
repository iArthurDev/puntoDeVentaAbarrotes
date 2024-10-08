/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.Inventario;
import Dominio.Producto;
import java.sql.Date;

/**
 *
 * @author ldoar
 */
public interface IInventarioDao {
    
    public boolean insert(Inventario inventario);
    
    public boolean updateVenta();
    
    public boolean updateSurtido(int idProducto, int nuevaCantidad);
    
    public boolean updateFechaModificacion(int idProducto);
    
    public Inventario selectProductoByID(int idProducto);
    
}
