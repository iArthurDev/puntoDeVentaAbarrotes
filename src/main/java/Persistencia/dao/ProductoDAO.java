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

    @Override
    public boolean insert(Producto producto) {
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

    @Override
    public List<Producto> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> selectByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto selectByID(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

}
