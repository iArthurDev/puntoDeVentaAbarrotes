/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.DetallePedido;
import Persistencia.interfaces.IDetallePedidoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class DetallePedidoDAO implements IDetallePedidoDao {

    private final Connection conexion;

    public DetallePedidoDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    @Override
    public boolean insert(DetallePedido detallePedido) {
        String sqlINSERT = "INSERT INTO detallePedido (idPedido, idProducto, cantidadPedida) VALUES (?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtInsert = conexion.prepareStatement(sqlINSERT)) {

            //Validar si el objeto enviado por parametro se encuentra vacio
            if (detallePedido == null) {
                throw new IllegalArgumentException("El objeto detallePedido no puede ser nulo");
            }

            stmtInsert.setInt(1, detallePedido.getIdPedido());
            stmtInsert.setInt(2, detallePedido.getIdProducto());
            stmtInsert.setInt(3, detallePedido.getCantidadPedida());

            registros = stmtInsert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Error al guardar en detallePedido: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Error en los datos de detallePedido: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return registros != 0;
    }

    @Override
    public List<DetallePedido> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetallePedido> selectAllByID(int idPedido) {
        String sqlSELECT = "SELECT * FROM detallepedido WHERE idPedido = ?";
        List<DetallePedido> detalles = new ArrayList<>();

        try (PreparedStatement stmtSelect = conexion.prepareStatement(sqlSELECT)) {

            stmtSelect.setInt(1, idPedido);

            try (ResultSet rs = stmtSelect.executeQuery()) {
                while (rs.next()) {
                    DetallePedido detalle = new DetallePedido();
                    detalle.setIdDetallePedido(rs.getInt("idDetallePedido"));
                    detalle.setIdPedido(rs.getInt("idPedido"));
                    detalle.setIdProducto(rs.getInt("idProducto"));
                    detalle.setCantidadPedida(rs.getInt("cantidadPedida"));

                    detalles.add(detalle);
                }

                if (detalles.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron productos para este pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return detalles;
    }

    @Override
    public DetallePedido selectByID(int idDetallePedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(DetallePedido detallePedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idDetallaPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
