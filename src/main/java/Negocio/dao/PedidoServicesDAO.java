/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.dao;

import Dominio.DetallePedido;
import Dominio.Inventario;
import Dominio.Pedido;
import Dominio.Producto;
import Dominio.Surtido;
import Negocio.interfaces.IPedidoServices;
import Persistencia.dao.ConexionDAO;
import Persistencia.dao.DetallePedidoDAO;
import Persistencia.dao.InventarioDAO;
import Persistencia.dao.PedidoDAO;
import Persistencia.dao.SurtidoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class PedidoServicesDAO implements IPedidoServices {

    private static Connection conexion;
    private final DetallePedidoDAO detallePedidoDao = new DetallePedidoDAO();
    private final SurtidoDAO surtidoDao = new SurtidoDAO();
    private final PedidoDAO pedidoDao = new PedidoDAO();
    private final InventarioDAO inventarioDao = new InventarioDAO();
    private static String estadoCerrado = "Cerrado";
    private static String estadoFinalizado = "Completado";

    public PedidoServicesDAO() {
        this.conexion = ConexionDAO.getInstance().obtenerConexion();
    }

    /**
     * Metodo que realiza un registro de todos los productos que contiene un
     * pedido
     *
     * @param idProveedor
     * @param productosSolicitados
     * @param cantidadesSolicitadas
     */
    @Override
    public void insertProductosPedido(int idProveedor, List<Producto> productosSolicitados, List<Integer> cantidadesSolicitadas) {
        try {
            //Desahbilitar autocommit
            conexion.setAutoCommit(false);

            double costoTotalPedido = 0;
            int totalProductos = 0;
            
            //Creacion de un nuevo pedido el cual solo contiene el ID del proveedor y la clave
            pedidoDao.insert(new Pedido(idProveedor, "TO-DO"));

            //Recuperacion del ultimo pedido registrado para proceder a registrar los detalles del pedido
            Pedido pedido = pedidoDao.selectLast();

            for (int i = 0; i < productosSolicitados.size(); i++) {
                Producto producto = productosSolicitados.get(i);
                int cantidad = cantidadesSolicitadas.get(i);

                //Sumar el total de productos que lleva el pedido
                totalProductos += cantidad;

                // Calcular el costo total del producto (precioCosto * cantidad)
                double costoProducto = producto.getPrecioCosto() * cantidad;
                costoTotalPedido += costoProducto;

                //Instancia de un nuevo objeto DetalleProducto
                DetallePedido nuevoDetalle = new DetallePedido();
                nuevoDetalle.setIdPedido(pedido.getIdPedido());
                nuevoDetalle.setIdProducto(producto.getIdProducto());
                nuevoDetalle.setCantidadPedida(cantidad);

                detallePedidoDao.insert(nuevoDetalle);
            }
            pedidoDao.updateCantidadPedido(pedido.getIdPedido(), totalProductos);
            pedidoDao.updateCosto(pedido.getIdPedido(), costoTotalPedido);
            pedidoDao.updateEstado(pedido.getIdPedido(), this.estadoCerrado);

            conexion.commit();
        } catch (SQLException ex) {
            try {
                // Si ocurre un error, hacer rollback
                if (conexion != null) {
                    conexion.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            ex.printStackTrace(System.out);
        } finally {
            try {
                // Volver a poner el autocommit en true
                if (conexion != null) {
                    conexion.setAutoCommit(true);
                }
                
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    /**
     * Metodo que realiza el registro de surtido de un pedido y actualiza las
     * cantidades disponibles de los productos en el inventario
     *
     * @param idPedido
     */
    @Override
    public void realizarSurtido(int idPedido) {

        try {

            if (pedidoDao.selectByID(idPedido).getEstado().equals(estadoFinalizado)) {
                JOptionPane.showMessageDialog(null, "El pedido ya ha sido cerrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Desahbilitar autocommit
            conexion.setAutoCommit(false);

            //Obtención de todos los productos que contiene un pedido
            List<DetallePedido> detalles = detallePedidoDao.selectAllByID(idPedido);

            if (!detalles.isEmpty()) {
                //Registro de un surtido
                surtidoDao.insert(new Surtido(idPedido, new java.sql.Date(System.currentTimeMillis())));
            }

            for (int i = 0; i < detalles.size(); i++) {
                int idProducto = detalles.get(i).getIdProducto();
                int cantidadSolicitada = detalles.get(i).getCantidadPedida();

                Inventario inventario = inventarioDao.selectProductoByID(idProducto);
                int nuevaCantidad = inventario.getCantidadDisponible() + cantidadSolicitada;

                inventario.setCantidadDisponible(nuevaCantidad);

                inventarioDao.updateSurtido(inventario.getIdProducto(), nuevaCantidad);

                inventarioDao.updateFechaModificacion(inventario.getIdProducto());

            }

            pedidoDao.updateEstado(idPedido, this.estadoFinalizado);

            conexion.commit();
        } catch (SQLException ex) {
            try {
                // Si ocurre un error, hacer rollback
                if (conexion != null) {
                    conexion.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            ex.printStackTrace(System.out);
        } finally {
            try {
                // Volver a poner el autocommit en true
                if (conexion != null) {
                    conexion.setAutoCommit(true);
                }
               
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
