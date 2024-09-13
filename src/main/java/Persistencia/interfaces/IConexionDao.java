/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import java.sql.Connection;

/**
 *
 * @author ldoar
 */
public interface IConexionDao {
    
    public Connection obtenerConexion();
    
    public void cerrarConexion();
}
