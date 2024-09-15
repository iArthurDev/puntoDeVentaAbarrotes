/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Dominio.Surtido;
import java.util.List;

/**
 *
 * @author ldoar
 */
public interface ISurtidoDao {
    
    public boolean insert(Surtido surtido);
    
    public List<Surtido> selectAll();
    
    public List<Surtido> selectByName(String nombre);
    
    public Surtido selectByID(int idSurtido);
    
    public boolean update(Surtido surtido);
    
    public boolean delete(int idSurtido);
}
