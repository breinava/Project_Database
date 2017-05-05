/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Logica.CargoEmpleado;
import Logica.Empleado;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breiner
 */
public class VEmpleado extends javax.swing.JFrame {

    Empleado em = new Empleado();
    CargoEmpleado ce = new CargoEmpleado();
    
    /**
     * Creates new form VEmpleado
     */
    
    public VEmpleado() throws SQLException {
        initComponents();
        pnl_Encabezado.setBackground(new Color(0,0,0,195));
        setLocationRelativeTo(null);
        setResizable(false);
        
        ce.ShowDataCargoEMPBox();
        em.ShowDataEmpleado();
        em.ShowDataBoxSearchEmpleado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Encabezado = new javax.swing.JPanel();
        jbtn_MIn = new javax.swing.JLabel();
        txt_Cerrar = new javax.swing.JLabel();
        jtxt_Titulo = new javax.swing.JLabel();
        jbtn_home = new javax.swing.JLabel();
        Encabezado = new javax.swing.JLabel();
        pnl_RegistroEmpleado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_DNIE = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_NombreE = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_RegistrarE = new javax.swing.JButton();
        Box_CargoE = new javax.swing.JComboBox<>();
        pnl_MostrarEmpleado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        btn_ActualizarE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Box_BuscarE = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        txt_BuscarE = new javax.swing.JTextField();
        jbtn_BuscarE = new javax.swing.JLabel();
        btn_EliminarE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jtxt_Titulo.setBackground(new java.awt.Color(204, 204, 204));
        jtxt_Titulo.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jtxt_Titulo.setForeground(new java.awt.Color(57, 113, 157));
        jtxt_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtxt_Titulo.setText("Empleado");
        pnl_Encabezado.add(jtxt_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 770, -1));

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

        pnl_RegistroEmpleado.setBackground(new java.awt.Color(32, 33, 35));
        pnl_RegistroEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Cedula");
        pnl_RegistroEmpleado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Nombre");
        pnl_RegistroEmpleado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Cargo");
        pnl_RegistroEmpleado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        pnl_RegistroEmpleado.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 10));

        txt_DNIE.setBackground(new java.awt.Color(32, 33, 35));
        txt_DNIE.setForeground(new java.awt.Color(255, 255, 255));
        txt_DNIE.setBorder(null);
        txt_DNIE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_DNIEFocusGained(evt);
            }
        });
        pnl_RegistroEmpleado.add(txt_DNIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, 30));
        pnl_RegistroEmpleado.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 10));

        txt_NombreE.setBackground(new java.awt.Color(32, 33, 35));
        txt_NombreE.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreE.setBorder(null);
        txt_NombreE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreEFocusGained(evt);
            }
        });
        pnl_RegistroEmpleado.add(txt_NombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 30));
        pnl_RegistroEmpleado.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, 10));

        btn_RegistrarE.setBackground(new java.awt.Color(126, 87, 194));
        btn_RegistrarE.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_RegistrarE.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarE.setText("Registrar");
        btn_RegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarEActionPerformed(evt);
            }
        });
        pnl_RegistroEmpleado.add(btn_RegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 290, 40));

        Box_CargoE.setBackground(new java.awt.Color(32, 33, 35));
        Box_CargoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_CargoE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Box_CargoEFocusGained(evt);
            }
        });
        pnl_RegistroEmpleado.add(Box_CargoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 185, 210, 30));

        getContentPane().add(pnl_RegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 500));

        pnl_MostrarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        pnl_MostrarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(32, 33, 35));

        TablaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        TablaEmpleado.setSelectionBackground(new java.awt.Color(32, 33, 35));
        TablaEmpleado.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane2.setViewportView(TablaEmpleado);

        pnl_MostrarEmpleado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 310));

        btn_ActualizarE.setBackground(new java.awt.Color(126, 87, 194));
        btn_ActualizarE.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ActualizarE.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarE.setText("Mostrar Todo");
        btn_ActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarEActionPerformed(evt);
            }
        });
        pnl_MostrarEmpleado.add(btn_ActualizarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 40));

        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Buscar");
        pnl_MostrarEmpleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 20));

        Box_BuscarE.setBackground(new java.awt.Color(32, 33, 35));
        Box_BuscarE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnl_MostrarEmpleado.add(Box_BuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));
        pnl_MostrarEmpleado.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

        txt_BuscarE.setBackground(new java.awt.Color(0, 0, 0));
        txt_BuscarE.setForeground(new java.awt.Color(204, 204, 204));
        txt_BuscarE.setBorder(null);
        pnl_MostrarEmpleado.add(txt_BuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, 20));

        jbtn_BuscarE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_BuscarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/searcher2.png"))); // NOI18N
        jbtn_BuscarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_BuscarEMouseClicked(evt);
            }
        });
        pnl_MostrarEmpleado.add(jbtn_BuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 30, 30));

        btn_EliminarE.setBackground(new java.awt.Color(126, 87, 194));
        btn_EliminarE.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_EliminarE.setForeground(new java.awt.Color(255, 255, 255));
        btn_EliminarE.setText("Eliminar");
        btn_EliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarEActionPerformed(evt);
            }
        });
        pnl_MostrarEmpleado.add(btn_EliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 40));

        getContentPane().add(pnl_MostrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_MInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_MInMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jbtn_MInMouseClicked

    private void txt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_txt_CerrarMouseClicked

    private void btn_RegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarEActionPerformed

        String dni = txt_DNIE.getText();
        String nombre = txt_NombreE.getText();
        String cargo = (String) Box_CargoE.getSelectedItem(); // Obtener dato del comboBox

        try {
            em.InsertEmpleado(dni, nombre,cargo);
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_RegistrarEActionPerformed

    private void btn_ActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarEActionPerformed
        try {
            em.ShowDataEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ActualizarEActionPerformed

    private void jbtn_BuscarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_BuscarEMouseClicked
        String buscarPor = (String)Box_BuscarE.getSelectedItem();
        String dato = txt_BuscarE.getText();
        String datL = "'"+dato+"'";

        System.out.println(datL);

        if(buscarPor.equals("NOMBRE")){
            try {
                em.SearchDataEmpleado(buscarPor,datL);
                em.ShowDataEmpleado(buscarPor,datL);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                em.SearchDataEmpleado(buscarPor,dato);
                em.ShowDataEmpleado(buscarPor,dato);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jbtn_BuscarEMouseClicked

    private void btn_EliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarEActionPerformed
        String id = String.valueOf((String)TablaEmpleado.getValueAt(TablaEmpleado.getSelectedRow(),0));

        try {
            em.DeleteDataEmpleado(id);
        } catch (SQLException ex) {
            Logger.getLogger(VProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_EliminarEActionPerformed

    private void jbtn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_homeMouseClicked
        Home home = new Home();

        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_homeMouseClicked

    private void txt_DNIEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DNIEFocusGained
        jLabel2.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_DNIEFocusGained

    private void txt_NombreEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreEFocusGained
        jLabel3.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_NombreEFocusGained

    private void Box_CargoEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Box_CargoEFocusGained
        jLabel4.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel2.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_Box_CargoEFocusGained

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
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VEmpleado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Box_BuscarE;
    public static javax.swing.JComboBox<String> Box_CargoE;
    private javax.swing.JLabel Encabezado;
    public static javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton btn_ActualizarE;
    private javax.swing.JButton btn_EliminarE;
    private javax.swing.JButton btn_RegistrarE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jbtn_BuscarE;
    private javax.swing.JLabel jbtn_MIn;
    private javax.swing.JLabel jbtn_home;
    private javax.swing.JLabel jtxt_Titulo;
    private javax.swing.JPanel pnl_Encabezado;
    private javax.swing.JPanel pnl_MostrarEmpleado;
    private javax.swing.JPanel pnl_RegistroEmpleado;
    private javax.swing.JTextField txt_BuscarE;
    private javax.swing.JLabel txt_Cerrar;
    private javax.swing.JTextField txt_DNIE;
    private javax.swing.JTextField txt_NombreE;
    // End of variables declaration//GEN-END:variables
}