/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Producto;
import Persistencia.interfaces.IProductoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class ProductoDAO implements IProductoDao {

    private final Connection conexion;

    public ProductoDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    /**
     * Metodo que realiza un nuevo registro en la tabla producto
     * @param producto
     * @return 
     */
    @Override
    public boolean insert(Producto producto) {

        if (this.exists(producto.getUpc()) == false) {
            JOptionPane.showMessageDialog(null, "Advertencia: El producto ya está registrado", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String sql = "INSERT INTO producto (idProveedor, upc, nombre, precioCosto, precioVenta, disponibilidad) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtINSERT = conexion.prepareStatement(sql)) {
            stmtINSERT.setInt(1, producto.getIdProveedor());
            stmtINSERT.setString(2, producto.getUpc());
            stmtINSERT.setString(3, producto.getNombreProducto());
            stmtINSERT.setDouble(4, producto.getPrecioCosto());
            stmtINSERT.setDouble(5, producto.getPrecioVenta());
            stmtINSERT.setString(6, "Disponible");

            registros = stmtINSERT.executeUpdate();
            JOptionPane.showMessageDialog(null, "Información: Se guardo el registro correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        if (registros == 0) {
            JOptionPane.showMessageDialog(null, "Advertencia: No se pudo guardar el registro", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        return registros != 0;
    }

    /**
     * Metodo que regresa una lista de todos los registro de la tabla producto
     * @return 
     */
    @Override
    public List<Producto> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo que regresa una lista de todos los registro de la tabla producto que coincidan con el nombre enviado por parametro
     * @param nombre
     * @return 
     */
    @Override
    public List<Producto> selectByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo que regresa una lista de todos los registro de la tabla producto que coincidan con el ID del producto enviado por enviado por parametro
     * @param idProducto
     * @return 
     */
    @Override
    public Producto selectByID(int idProducto) {
        Producto producto = null;
        
        String sqlSELECT = "SELECT * FROM producto WHERE idProducto = ?";
        
        try (PreparedStatement stmtSelect = conexion.prepareStatement(sqlSELECT)){
            stmtSelect.setInt(1, idProducto);
            
            ResultSet rs = stmtSelect.executeQuery();
            
            if ( rs.next()) {
                producto = new Producto(
                        rs.getInt("idProducto"), 
                        rs.getInt("idProveedor"), 
                        rs.getString("upc"), 
                        rs.getString("nombre"), 
                        rs.getDouble("precioCosto"), 
                        rs.getDouble("precioVenta"), 
                        rs.getString("disponibilidad"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return producto;
    }

    @Override
    public boolean update(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Metodo que regresa el ultimo registro realizado
     * @return 
     */
    @Override
    public Producto selectLast() {
        Producto producto = null;
        String sqlSELECT_LAST = "SELECT * FROM producto ORDER BY idProducto DESC LIMIT 1";

        try (PreparedStatement stmtSelect = this.conexion.prepareStatement(sqlSELECT_LAST); ResultSet rs = stmtSelect.executeQuery()) {

            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setIdProveedor(rs.getInt("idProveedor"));
                producto.setUpc(rs.getString("upc"));
                producto.setNombreProducto(rs.getString("nombre"));
                producto.setPrecioVenta(rs.getDouble("precioVenta"));
                producto.setPrecioCosto(rs.getDouble("precioCosto"));
                producto.setDisponibilidad(rs.getString("disponibilidad"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return producto;
    }

    /**
     * Metodo que comprueba si ya existe un producto registrado
     * @param upc
     * @return 
     */
    @Override
    public boolean exists(String upc) {

        String sqlEXIST = "SELECT COUNT(*) FROM producto WHERER upc = ?";
        boolean exists = false;

        try (PreparedStatement stmtExist = conexion.prepareStatement(sqlEXIST)) {
            stmtExist.setString(1, upc);
            ResultSet rs = stmtExist.executeQuery();

            if (rs.next()) {
                exists = rs.getInt(1) < 0;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return exists;
    }

}
