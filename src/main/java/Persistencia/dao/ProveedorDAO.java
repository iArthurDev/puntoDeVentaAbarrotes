/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Proveedor;
import Persistencia.interfaces.IProveedorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class ProveedorDAO implements IProveedorDao {

    private final Connection conexion;

    public ProveedorDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    @Override
    public boolean insert(Proveedor proveedor) {
        String sqlINSERT = "INSERT INTO proveedor (nombre, email, telefono) VALUES (?, ?, ?)";
        int registros = 0;

        try (PreparedStatement stmtInsert = this.conexion.prepareStatement(sqlINSERT)) {
            stmtInsert.setString(1, proveedor.getNombreProveedor());
            stmtInsert.setString(2, proveedor.getEmail());
            stmtInsert.setString(3, proveedor.getNumeroTelefono());

            registros = stmtInsert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Información: Se guardo el registro correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        return registros != 0;
    }

    @Override
    public List<Proveedor> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Proveedor> selectByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Proveedor selectByID(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
