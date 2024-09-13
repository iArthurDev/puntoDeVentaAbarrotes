/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Persistencia.interfaces.IConexionDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ldoar
 */
public class ConexionDAO implements IConexionDao{

    //Instancia unica de la conexión
    private static ConexionDAO conexionUnica;
    private Connection conexion;
    
    //Declaración de constantes para la conexión a la base de datos
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/abarrotes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345";

    public ConexionDAO() {
        try {
            this.conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static ConexionDAO getInstance(){
        if (conexionUnica == null) {
            synchronized (ConexionDAO.class) {
                if (conexionUnica == null) {
                    conexionUnica = new ConexionDAO();
                }
            }
        }
        return conexionUnica;
    }
    
    @Override
    public Connection obtenerConexion() {
        return this.conexion;
    }

    @Override
    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
}
