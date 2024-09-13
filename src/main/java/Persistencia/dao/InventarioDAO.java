/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Inventario;
import Persistencia.interfaces.IInventarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class InventarioDAO implements IInventarioDao{

    private final Connection conexion;

    public InventarioDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }
    
    @Override
    public boolean insert(Inventario inventario) {
        String sql = "INSERT INTO inventario (idProducto, cantidadDisponible, fechaModificacion) "
                + "VALUES (?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtINSERT = conexion.prepareStatement(sql)) {
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
}
