/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Logica.CategoriaProducto;
import Logica.Producto;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breiner
 */
public class VProducto extends javax.swing.JFrame {
    
    Producto pd = new Producto();
    CategoriaProducto ca = new CategoriaProducto();

    /**
     * Creates new form VProducto
     */
    public VProducto() throws SQLException {
        initComponents();
        pnl_Encabezado.setBackground(new Color(0,0,0,195));
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        pd.ShowDataProducto();
        ca.ShowDataCategoriaPDBox();
        pd.ShowDataBoxSearchProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_RegistroProducto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_NombreP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_PrecioComP = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_RegistrarP = new javax.swing.JButton();
        Box_Categoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_PrecioVenP = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pnl_MostrarProducto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        btn_ActualizarP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Box_BuscarP = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        txt_BuscarP = new javax.swing.JTextField();
        jbtn_BuscarP = new javax.swing.JLabel();
        btn_Eliminar = new javax.swing.JButton();
        pnl_Encabezado = new javax.swing.JPanel();
        jbtn_MIn = new javax.swing.JLabel();
        txt_Cerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtn_home = new javax.swing.JLabel();
        Encabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_RegistroProducto.setBackground(new java.awt.Color(32, 33, 35));
        pnl_RegistroProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Nombre");
        pnl_RegistroProducto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Precio Venta");
        pnl_RegistroProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Categoria");
        pnl_RegistroProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        pnl_RegistroProducto.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 10));

        txt_NombreP.setBackground(new java.awt.Color(32, 33, 35));
        txt_NombreP.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreP.setBorder(null);
        txt_NombreP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombrePFocusGained(evt);
            }
        });
        pnl_RegistroProducto.add(txt_NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, 30));
        pnl_RegistroProducto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 10));

        txt_PrecioComP.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioComP.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioComP.setBorder(null);
        txt_PrecioComP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioComPFocusGained(evt);
            }
        });
        pnl_RegistroProducto.add(txt_PrecioComP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 30));
        pnl_RegistroProducto.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 210, 10));

        btn_RegistrarP.setBackground(new java.awt.Color(126, 87, 194));
        btn_RegistrarP.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_RegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarP.setText("Registrar");
        btn_RegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarPActionPerformed(evt);
            }
        });
        pnl_RegistroProducto.add(btn_RegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 290, 40));

        Box_Categoria.setBackground(new java.awt.Color(32, 33, 35));
        Box_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_Categoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Box_CategoriaFocusGained(evt);
            }
        });
        pnl_RegistroProducto.add(Box_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, -1));

        jLabel5.setForeground(new java.awt.Color(52, 52, 54));
        jLabel5.setText("Precio Compra");
        pnl_RegistroProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txt_PrecioVenP.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioVenP.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioVenP.setBorder(null);
        txt_PrecioVenP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioVenPFocusGained(evt);
            }
        });
        pnl_RegistroProducto.add(txt_PrecioVenP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, 30));
        pnl_RegistroProducto.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, 10));

        getContentPane().add(pnl_RegistroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 500));

        pnl_MostrarProducto.setBackground(new java.awt.Color(0, 0, 0));
        pnl_MostrarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(32, 33, 35));

        TablaProducto.setForeground(new java.awt.Color(0, 0, 0));
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        TablaProducto.setSelectionBackground(new java.awt.Color(32, 33, 35));
        TablaProducto.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane2.setViewportView(TablaProducto);

        pnl_MostrarProducto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 310));

        btn_ActualizarP.setBackground(new java.awt.Color(126, 87, 194));
        btn_ActualizarP.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ActualizarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarP.setText("Mostrar Todo");
        btn_ActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarPActionPerformed(evt);
            }
        });
        pnl_MostrarProducto.add(btn_ActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 40));

        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Buscar");
        pnl_MostrarProducto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 20));

        Box_BuscarP.setBackground(new java.awt.Color(32, 33, 35));
        Box_BuscarP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnl_MostrarProducto.add(Box_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));
        pnl_MostrarProducto.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

        txt_BuscarP.setBackground(new java.awt.Color(0, 0, 0));
        txt_BuscarP.setForeground(new java.awt.Color(204, 204, 204));
        txt_BuscarP.setBorder(null);
        pnl_MostrarProducto.add(txt_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, 20));

        jbtn_BuscarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_BuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/searcher2.png"))); // NOI18N
        jbtn_BuscarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_BuscarPMouseClicked(evt);
            }
        });
        pnl_MostrarProducto.add(jbtn_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 30, 30));

        btn_Eliminar.setBackground(new java.awt.Color(126, 87, 194));
        btn_Eliminar.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        pnl_MostrarProducto.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 40));

        getContentPane().add(pnl_MostrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 470, 500));

        pnl_Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_MIn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbtn_MIn.setForeground(new java.awt.Color(57, 113, 177));
        jbtn_MIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_MIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minizar2.png"))); // NOI18N
        jbtn_MIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_MInMouseClicked(evt);
            }
        });
        pnl_Encabezado.add(jbtn_MIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 20, 30));

        txt_Cerrar.setForeground(new java.awt.Color(57, 113, 177));
        txt_Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close2.png"))); // NOI18N
        txt_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CerrarMouseClicked(evt);
            }
        });
        pnl_Encabezado.add(txt_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 20, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 113, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Producto");
        pnl_Encabezado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 770, -1));

        jbtn_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home1.png"))); // NOI18N
        jbtn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_homeMouseClicked(evt);
            }
        });
        pnl_Encabezado.add(jbtn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(pnl_Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        Encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encabezado.jpg"))); // NOI18N
        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarPActionPerformed

        String nombre = txt_NombreP.getText();
        String precio_compra = txt_PrecioComP.getText();
        String precio_venta = txt_PrecioVenP.getText();
        String catg = (String) Box_Categoria.getSelectedItem(); // Obtener dato del comboBox
        
        try {
            pd.InsertProducto(nombre, precio_compra,precio_venta,catg);
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_RegistrarPActionPerformed

    private void btn_ActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarPActionPerformed
        try {
            pd.ShowDataProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ActualizarPActionPerformed

    private void jbtn_MInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_MInMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jbtn_MInMouseClicked

    private void txt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_txt_CerrarMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String id = String.valueOf((String)TablaProducto.getValueAt(TablaProducto.getSelectedRow(),0));
        
        try {
            pd.DeleteDataProducto(id);
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void jbtn_BuscarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_BuscarPMouseClicked
        String buscarPor = (String)Box_BuscarP.getSelectedItem();
        String dato = txt_BuscarP.getText();
        String datL = "'"+dato+"'";

        System.out.println(datL);

        if(buscarPor.equals("NOMBRE")){
            try {
                pd.SearchDataProducto(buscarPor,datL);
                pd.ShowDataProducto(buscarPor,datL);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                pd.SearchDataProducto(buscarPor,datL);
                pd.ShowDataProducto(buscarPor,datL);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }//GEN-LAST:event_jbtn_BuscarPMouseClicked

    private void jbtn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_homeMouseClicked
        Home home = new Home();

        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_homeMouseClicked

    private void txt_NombrePFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombrePFocusGained
        jLabel2.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_NombrePFocusGained

    private void txt_PrecioComPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioComPFocusGained
        jLabel3.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_PrecioComPFocusGained

    private void Box_CategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Box_CategoriaFocusGained
        jLabel4.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel2.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_Box_CategoriaFocusGained

    private void txt_PrecioVenPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioVenPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVenPFocusGained

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
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VProducto().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Box_BuscarP;
    public static javax.swing.JComboBox<String> Box_Categoria;
    private javax.swing.JLabel Encabezado;
    public static javax.swing.JTable TablaProducto;
    private javax.swing.JButton btn_ActualizarP;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_RegistrarP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jbtn_BuscarP;
    private javax.swing.JLabel jbtn_MIn;
    private javax.swing.JLabel jbtn_home;
    private javax.swing.JPanel pnl_Encabezado;
    private javax.swing.JPanel pnl_MostrarProducto;
    private javax.swing.JPanel pnl_RegistroProducto;
    private javax.swing.JTextField txt_BuscarP;
    private javax.swing.JLabel txt_Cerrar;
    private javax.swing.JTextField txt_NombreP;
    private javax.swing.JTextField txt_PrecioComP;
    private javax.swing.JTextField txt_PrecioVenP;
    // End of variables declaration//GEN-END:variables
}
