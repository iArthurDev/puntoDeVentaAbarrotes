/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio.interfaces;

import Dominio.Producto;
import java.sql.Date;

/**
 *
 * @author ldoar
 */
public interface IInventarioServices {
    
    public void insertProducto(Producto producto, int cantidadDisponible);
}
