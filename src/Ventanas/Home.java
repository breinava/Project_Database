package Ventanas;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author breiner
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        jPanel3.setBackground(new Color(102,102,102,195));
        setResizable(false);
        setLocationRelativeTo(null);
        
        String algo = "Breiner";
        NameUser.setText(algo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plus_mas = new javax.swing.JPopupMenu();
        menu_Cliente = new javax.swing.JMenuItem();
        menu_Producto = new javax.swing.JMenuItem();
        menu_CategoriaPD = new javax.swing.JMenuItem();
        menu_Empleado = new javax.swing.JMenuItem();
        menu_CargoEMP = new javax.swing.JMenuItem();
        opcion_menu = new javax.swing.JPopupMenu();
        menu_Comprar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jbtn_plus = new javax.swing.JLabel();
        jbtn_opcion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSearch = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jUser = new javax.swing.JLabel();
        NameUser = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        menu_Cliente.setText("Cliente");
        menu_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ClienteActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Cliente);

        menu_Producto.setText("Producto");
        menu_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ProductoActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Producto);

        menu_CategoriaPD.setText("Categoria");
        menu_CategoriaPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CategoriaPDActionPerformed(evt);
            }
        });
        plus_mas.add(menu_CategoriaPD);

        menu_Empleado.setText("Empleado");
        menu_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EmpleadoActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Empleado);

        menu_CargoEMP.setText("Cargo");
        menu_CargoEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CargoEMPActionPerformed(evt);
            }
        });
        plus_mas.add(menu_CargoEMP);

        menu_Comprar.setText("Comprar");
        opcion_menu.add(menu_Comprar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus1.png"))); // NOI18N
        jbtn_plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_plusMouseClicked(evt);
            }
        });
        jPanel1.add(jbtn_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jbtn_opcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-button3.png"))); // NOI18N
        jbtn_opcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_opcionMouseClicked(evt);
            }
        });
        jPanel1.add(jbtn_opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 560));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("AquaBase", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(126, 87, 194));
        jLabel3.setText("Categorias");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 780, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rating.png"))); // NOI18N
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel16.setFont(new java.awt.Font("AquaBase", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ropa");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ropa-Hombre2.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 130));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 240, 210));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rating.png"))); // NOI18N
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel10.setFont(new java.awt.Font("AquaBase", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Calzado");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calzado6.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 210));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rating.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel14.setFont(new java.awt.Font("AquaBase", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Accesorios");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accesorios2.png"))); // NOI18N
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 130));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 240, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 860, 310));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("SoftWareHouse v2.0");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("  Stay Update on latest UI");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 860, 200));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minizar2.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 20, 30));

        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close2.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel4.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 20, 30));

        jSeparator1.setBackground(new java.awt.Color(32, 33, 35));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 390, 10));

        jSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/searcher1.png"))); // NOI18N
        jPanel4.add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, 20));

        jUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user1.png"))); // NOI18N
        jUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUserMouseClicked(evt);
            }
        });
        jPanel4.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 50));

        NameUser.setBackground(new java.awt.Color(204, 204, 204));
        NameUser.setFont(new java.awt.Font("DejaVu Sans Light", 0, 12)); // NOI18N
        NameUser.setForeground(new java.awt.Color(57, 113, 177));
        jPanel4.add(NameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 70, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 860, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondohome1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        
        this.setExtendedState(1);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void jUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserMouseClicked
        // TODO add your handling code here:
        /*Login lh = new Login();
        
        lh.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_jUserMouseClicked

    private void jbtn_opcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_opcionMouseClicked
        opcion_menu.show(jbtn_opcion,WIDTH, WIDTH);
    }//GEN-LAST:event_jbtn_opcionMouseClicked

    private void jbtn_plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_plusMouseClicked
        plus_mas.show(jbtn_plus, WIDTH, WIDTH);
    }//GEN-LAST:event_jbtn_plusMouseClicked

    private void menu_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClienteActionPerformed
        VCliente vc = null;
        try {
            vc = new VCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_ClienteActionPerformed

    private void menu_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductoActionPerformed
        VProducto vp = null;
        try {
            vp = new VProducto();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_ProductoActionPerformed

    private void menu_CategoriaPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CategoriaPDActionPerformed
        VCategoriaProducto vcp = null;
        try {
            vcp = new  VCategoriaProducto();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_CategoriaPDActionPerformed

    private void menu_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EmpleadoActionPerformed
        VEmpleado ve = null;
        try {
            ve = new VEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        ve.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_EmpleadoActionPerformed

    private void menu_CargoEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CargoEMPActionPerformed
        VCargoEmpleado vce = null;
        try {
            vce = new VCargoEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vce.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_CargoEMPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel NameUser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jbtn_opcion;
    private javax.swing.JLabel jbtn_plus;
    private javax.swing.JMenuItem menu_CargoEMP;
    private javax.swing.JMenuItem menu_CategoriaPD;
    private javax.swing.JMenuItem menu_Cliente;
    private javax.swing.JMenuItem menu_Comprar;
    private javax.swing.JMenuItem menu_Empleado;
    private javax.swing.JMenuItem menu_Producto;
    private javax.swing.JPopupMenu opcion_menu;
    private javax.swing.JPopupMenu plus_mas;
    // End of variables declaration//GEN-END:variables
}