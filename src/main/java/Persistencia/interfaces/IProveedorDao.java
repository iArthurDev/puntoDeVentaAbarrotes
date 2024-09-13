/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.Proveedor;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface IProveedorDao {
    
    public boolean insert(Proveedor proveedor);
    
    public List<Proveedor> selectAll();
    
    public List<Proveedor> selectByName(String nombre);
    
    public Proveedor selectByID(Proveedor proveedor);
    
    public boolean update(Proveedor proveedor);
    
    public boolean delete(Proveedor proveedor);
    
}
