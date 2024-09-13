/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.Producto;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface IProductoDao {
    
    public boolean insert(Producto producto);
    
    public List<Producto> selectAll();
    
    public List<Producto> selectByName(String nombre);
    
    public Producto selectByID(Producto producto);
    
    public Producto selectLast();
    
    public boolean update(Producto producto);
    
    public boolean delete(Producto producto);
}
