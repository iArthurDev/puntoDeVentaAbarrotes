/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.puntoventaabarrotes;

import Dominio.Inventario;
import Dominio.Producto;
import Dominio.Proveedor;
import Negocio.dao.InventarioServicesDAO;
import Persistencia.dao.ProveedorDAO;
import Presentacion.FrmMenu;
import java.sql.Date;

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


//        Proveedor proveedorNuevo = new Proveedor(1, "Sabritas", "Sabritas@gmail.com", "6442510255");
//        
//        Producto productoNuevo = new Producto(1, proveedorNuevo, "85020", "Tostitos 220grs", 20.5, 19, "Disponible");
//        
//        System.out.println(productoNuevo.toString());
//        
//        Inventario inventario = new Inventario(1, productoNuevo, 30, new java.sql.Date(System.currentTimeMillis()));
//        
//        System.out.println(inventario.toString());

        ProveedorDAO proveedorDao = new ProveedorDAO();
        
        Proveedor proveedor = new Proveedor("Yaqui", "CremeriaYaqui@gmail.com", "6443022579");
        
//        proveedorDao.insert(new Proveedor("Yaqui", "CremeriaYaqui@gmail.com", "6443022579"));
        
        Producto producto = new Producto(1, "854410", "Leche entera 4lts", 35, 43, "Disponible");
        
        InventarioServicesDAO inventarioServices = new InventarioServicesDAO();
        
        inventarioServices.insertProducto(producto, 15);
    }
}
