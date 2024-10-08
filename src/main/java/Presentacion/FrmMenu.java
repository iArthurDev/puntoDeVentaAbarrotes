/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;
import javax.swing.JOptionPane;

/**
 *
 * @author ldoar
 */
public class FrmMenu extends javax.swing.JFrame {

    
    /**
     * Creates new form frmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVenta2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlbVentas = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jlblLogoMenu = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnVenta2.setBackground(new java.awt.Color(255, 153, 51));
        btnVenta2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnVenta2.setText("Nueva venta");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abarrotes ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Viking", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Zarifa");

        btnVenta.setBackground(new java.awt.Color(255, 153, 51));
        btnVenta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnVenta.setText("Nueva venta");
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Ventas del día:");

        jlbVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbVentas.setText("0");

        btnInventario.setBackground(new java.awt.Color(255, 153, 51));
        btnInventario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(255, 153, 51));
        btnProveedores.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });

        jlblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jlbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jlblLogoMenu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jlblLogoMenu)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlbVentas))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        //opciones de admnistrar inventario
        String[] opciones = {"Consultar proveedores", "Nuevo surtido"};

        //obtiene la opcion seleccionada por el usuario
        int opcion = JOptionPane.showOptionDialog(this, "¿Qué deseas realizar?", "", JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, 
                opciones, opciones[0]);
        
        if (opcion == 0) {
            FrmProveedores frmProveedores = new FrmProveedores();
        }
        if (opcion == 1) {
            FrmSurtido frmSurtido = new FrmSurtido();
        }
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        String[] opciones = {"Consultar inventario", "Nuevo producto"};

        //obtiene la opcion seleccionada por el usuario
        int opcion = JOptionPane.showOptionDialog(this, "¿Qué deseas realizar?", "", JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, 
                opciones, opciones[0]);
        
        if (opcion == 0) {
            FrmInventario frmInventario = new FrmInventario();
        }
        if (opcion == 1) {
            FrmProducto frmProducto = new FrmProducto();
        }
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        FrmVenta frmVenta = new FrmVenta();
    }//GEN-LAST:event_btnVentaMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnVenta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbVentas;
    private javax.swing.JLabel jlblLogoMenu;
    // End of variables declaration//GEN-END:variables
}
