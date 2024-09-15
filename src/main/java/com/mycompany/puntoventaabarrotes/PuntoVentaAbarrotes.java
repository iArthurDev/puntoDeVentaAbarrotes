/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.puntoventaabarrotes;

import Dominio.DetallePedido;
import Dominio.Inventario;
import Dominio.Pedido;
import Dominio.Producto;
import Dominio.Proveedor;
import Dominio.Surtido;
import Negocio.dao.InventarioServicesDAO;
import Negocio.dao.PedidoServicesDAO;
import Persistencia.dao.DetallePedidoDAO;
import Persistencia.dao.PedidoDAO;
import Persistencia.dao.ProductoDAO;
import Persistencia.dao.ProveedorDAO;
import Persistencia.dao.SurtidoDAO;
import Presentacion.FrmMenu;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ldoar
 */
public class PuntoVentaAbarrotes {

    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMenu().setVisible(true);
//            }
//        });

        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> productos = new ArrayList<>();
        List<Integer> cantidadesSolicitadas = new ArrayList<>();
        
        productos.add(productoDAO.selectByID(10));
        cantidadesSolicitadas.add(2);
        
        PedidoServicesDAO pedidoServices = new PedidoServicesDAO();
        
//        pedidoServices.insertProductosPedido(5, productos, cantidadesSolicitadas);

        pedidoServices.realizarSurtido(10);
        
    }
}
