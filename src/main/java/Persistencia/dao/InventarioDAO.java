/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Inventario;
import Persistencia.interfaces.IInventarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class InventarioDAO implements IInventarioDao {

    private final Connection conexion;

    public InventarioDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    /**
     * Metodo que realiza un nuevo registro en la tabla inventario
     *
     * @param inventario
     * @return
     */
    @Override
    public boolean insert(Inventario inventario) {
        String sql = "INSERT INTO inventario (idProducto, cantidadDisponible, fechaModificacion) "
                + "VALUES (?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtINSERT = conexion.prepareStatement(sql); conexion) {
            stmtINSERT.setInt(1, inventario.getIdProducto());
            stmtINSERT.setInt(2, inventario.getCantidadDisponible());
            stmtINSERT.setDate(3, new java.sql.Date(System.currentTimeMillis()));

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
    public boolean updateVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateSurtido(int idProducto, int nuevaCantidad) {
        String sqlUPDATE = "UPDATE inventario SET cantidadDisponible = ? WHERE idProducto = ?";
        int registros = 0;

        try (PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUPDATE)) {
            stmtUpdate.setInt(1, nuevaCantidad);
            stmtUpdate.setInt(2, idProducto);

            registros = stmtUpdate.executeUpdate();
            JOptionPane.showMessageDialog(null, "Información: Inventario actualizado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        if (registros == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el producto con el ID proporcionado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return registros != 0;
    }

    @Override
    public Inventario selectProductoByID(int idProducto) {
        Inventario inventario = null;
        String sqlSELECT = "SELECT * FROM inventario WHERE idProducto = ?";

        try (PreparedStatement stmtSelect = conexion.prepareStatement(sqlSELECT)) {
            stmtSelect.setInt(1, idProducto);

            try (ResultSet rs = stmtSelect.executeQuery()) {

                if (rs.next()) {
                    inventario = new Inventario(rs.getInt("idinventario"), rs.getInt("idProducto"), rs.getInt("cantidadDisponible"));
                } else {
                    JOptionPane.showMessageDialog(null, "Advertencia: No se encontreo registro en el inventario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return inventario;
    }

    @Override
    public boolean updateFechaModificacion(int idProducto) {
        String sqlUPDATE = "UPDATE inventario SET fechaModificacion = ? WHERE idProducto = ?";
        int registros = 0;
        try (PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUPDATE)) {
            stmtUpdate.setDate(1, new java.sql.Date(System.currentTimeMillis()));
            stmtUpdate.setInt(2, idProducto);

            registros = stmtUpdate.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        if (registros == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el producto con el ID proporcionado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return registros != 0;
    }
}
