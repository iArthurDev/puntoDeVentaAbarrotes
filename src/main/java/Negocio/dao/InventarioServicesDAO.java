/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.dao;

import Dominio.Inventario;
import Dominio.Producto;
import Negocio.interfaces.IInventarioServices;
import Persistencia.dao.ConexionDAO;
import Persistencia.dao.InventarioDAO;
import Persistencia.dao.ProductoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class InventarioServicesDAO implements IInventarioServices {

    private static Connection conexion;
    private final ProductoDAO productoDao = new ProductoDAO();
    private final InventarioDAO inventarioDao = new InventarioDAO();

    public InventarioServicesDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    /**
     * Metodo que ejecuta el registro de un nuevo producto en el inventario
     * @param producto
     * @param cantidadDisponible 
     */
    @Override
    public void insertProducto(Producto producto, int cantidadDisponible) {

        try {
            //Desahbilitar autocommit
            conexion.setAutoCommit(false);

            //Realizar el registro de un nuevo producto
            if (productoDao.insert(producto) == true) {
                int idProducto = productoDao.selectLast().getIdProducto();

                inventarioDao.insert(new Inventario(idProducto, cantidadDisponible));

                conexion.commit();
            } else{
                JOptionPane.showMessageDialog(null, "Advertencia: No se pudo hacer el registro en el inventario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }

            //Obtener el id del ultimo producto agregado
        } catch (SQLException ex) {
            // Revertir la transacción en caso de error
            try {
                if (conexion != null) {
                    conexion.rollback();
                }
            } catch (SQLException e) {
            }
        } finally {
            try {
                if (conexion != null) {
                    conexion.setAutoCommit(true);
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void surtirInventario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void realizarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
