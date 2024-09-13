/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.dao;

import Dominio.Inventario;
import Dominio.Producto;
import Negocio.interfaces.IInventarioServices;
import Persistencia.dao.InventarioDAO;
import Persistencia.dao.ProductoDAO;
/**
 *
 * @author ldoar
 */
public class InventarioServicesDAO implements IInventarioServices{
   private final ProductoDAO productoDao = new ProductoDAO();
   private final InventarioDAO inventarioDao = new InventarioDAO();
    
    
    @Override
    public void insertProducto(Producto producto, int cantidadDisponible) {
        productoDao.insert(producto);
        inventarioDao.insert(new Inventario(productoDao.selectLast().getIdProducto(), cantidadDisponible));
        
    }
    
}
