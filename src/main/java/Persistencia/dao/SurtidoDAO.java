/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Surtido;
import Persistencia.interfaces.ISurtidoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class SurtidoDAO implements ISurtidoDao{

    private final Connection conexion;

    public SurtidoDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }
    
    @Override
    public boolean insert(Surtido surtido) {

        String sqlINSERT = "INSERT INTO surtido (idPedido, fechaSurtido) "
                + "VALUES (?, ?)";
        int registros = 0;

        try (PreparedStatement stmtInsert = conexion.prepareStatement(sqlINSERT)) {
            stmtInsert.setInt(1, surtido.getIdPedido());
            stmtInsert.setDate(2, new java.sql.Date(System.currentTimeMillis()));
            
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
    public List<Surtido> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Surtido> selectByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Surtido selectByID(int idSurtido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Surtido surtido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSurtido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
