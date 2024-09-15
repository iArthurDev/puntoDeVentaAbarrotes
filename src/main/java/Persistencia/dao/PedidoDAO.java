/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Pedido;
import Persistencia.interfaces.IPedidoDao;
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
public class PedidoDAO implements IPedidoDao {

    private final Connection conexion;

    public PedidoDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    @Override
    public boolean insert(Pedido pedido) {
        String sqlINSERT = "INSERT INTO pedido (idProveedor, clave, cantidadProductos, costoPedido, fechaPedido, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtInsert = conexion.prepareStatement(sqlINSERT)) {
            stmtInsert.setInt(1, pedido.getIdProveedor());
            stmtInsert.setString(2, pedido.getClave());
            stmtInsert.setInt(3, 0);
            stmtInsert.setDouble(4, 0);
            stmtInsert.setDate(5, new java.sql.Date(System.currentTimeMillis()));
            stmtInsert.setString(6, "Pendiente");

            registros = stmtInsert.executeUpdate();
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
    public List<Pedido> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pedido> selectByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pedido selectByID(int idPedido) {

        String sqlSELECT = "SELECT * FROM pedido WHERE idPedido = ?";
        Pedido pedido = null;

        try (PreparedStatement stmtSELECT = conexion.prepareStatement(sqlSELECT)) {
            stmtSELECT.setInt(1, idPedido);

            try (ResultSet rs = stmtSELECT.executeQuery()) {
                if (rs.next()) {
                    pedido = new Pedido();
                    pedido.setIdPedido(rs.getInt("idPedido"));
                    pedido.setIdProveedor(rs.getInt("idProveedor"));
                    pedido.setClave(rs.getString("clave"));
                    pedido.setCantidadProductos(rs.getInt("cantidadProductos"));
                    pedido.setCostoPedido(rs.getDouble("costoPedido"));
                    pedido.setFechaPedido(rs.getDate("fechaPedido"));
                    pedido.setEstado(rs.getString("estado"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        
        return pedido;
    }

    @Override
    public boolean update(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateEstado(int idPedido, String estado) {
        String sqlUPDATE = "UPDATE pedido SET estado = ? WHERE idPedido = ?";
        int registros = 0;

        try (PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUPDATE)) {
            stmtUpdate.setString(1, estado);
            stmtUpdate.setInt(2, idPedido);

            registros = stmtUpdate.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        if (registros == 0) {
            JOptionPane.showMessageDialog(null, "Advertencia: No se pudo actualizar el registro", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        return registros != 0;
    }

    @Override
    public Pedido selectLast() {
        Pedido pedido = null;
        String sqlSELECT_LAST = "SELECT * FROM pedido ORDER BY idPedido DESC LIMIT 1";

        try (PreparedStatement stmtSelect = this.conexion.prepareStatement(sqlSELECT_LAST); ResultSet rs = stmtSelect.executeQuery()) {

            if (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setIdProveedor(rs.getInt("idProveedor"));
                pedido.setCantidadProductos(rs.getInt("cantidadProductos"));
                pedido.setCostoPedido(rs.getDouble("costoPedido"));
                pedido.setFechaPedido(rs.getDate("fechaPedido"));
                pedido.setEstado(rs.getString("estado"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return pedido;
    }

    @Override
    public boolean updateCosto(int idPedido, double costoPedido) {
        String sqlUPDATE = "UPDATE pedido SET costoPedido = ? WHERE idPedido = ?";
        int registros = 0;

        try (PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUPDATE)) {
            stmtUpdate.setDouble(1, costoPedido);
            stmtUpdate.setInt(2, idPedido);

            registros = stmtUpdate.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return registros != 0;
    }

    @Override
    public boolean updateCantidadPedido(int idPedido, int cantidad) {
        String sqlUPDATE = "UPDATE pedido SET cantidadProductos = ? WHERE idPedido = ?";
        int registros = 0;

        try (PreparedStatement stmtUpdate = conexion.prepareStatement(sqlUPDATE)) {
            stmtUpdate.setInt(1, cantidad);
            stmtUpdate.setInt(2, idPedido);

            registros = stmtUpdate.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        if (registros == 0) {
            JOptionPane.showMessageDialog(null, "Advertencia: No se pudo actualizar el registro", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        return registros != 0;
    }

}
