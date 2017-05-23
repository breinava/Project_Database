/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VProducto.Box_BuscarP;
import static Ventanas.VProducto.TablaProducto;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breiner
 */
public class Producto {
    
    MySQL cnx = new MySQL();
    
//Insertar Datos en la Tabla Producto    
    public void InsertProducto(String Nombre, String Precio_Compra, String Precio_Venta , String Categoria) throws SQLException{
        
        cnx.MySQLCnx();
        
        String CategoriaID = "";
        
        try{
            
            String Ct = "SELECT * FROM CATEGORIAS WHERE NOMBRE='"+Categoria+"'";
            Statement st = Conexion.createStatement();
            ResultSet rst = st.executeQuery(Ct);
            rst.next();
            
            CategoriaID = String.valueOf(rst.getInt("idCategorias"));
                        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        try{
                        
            String Query = "INSERT INTO PRODUCTOS VALUES (idPRODUCTOS,'"+Nombre+"',"+Precio_Compra+","+Precio_Venta+","+CategoriaID+")";
            
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Producto
    public void ShowDataProducto() throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM PRODUCTOS";
            Statement st = Conexion.createStatement();
            ResultSet rstb = st.executeQuery(Query);
            ResultSetMetaData rsmd = rstb.getMetaData();
            
            int col = rsmd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel(); // CRea un modelo del JTable
            
            for(int i=1; i<=col; i++){ // Se agregan los titulos de JTable
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            
            while(rstb.next()){
                String fila[] = new String[col];
                
                for(int j=0; j<col; j++){
                    fila[j] = rstb.getString(j+1);
                }
                
                modelo.addRow(fila);
            }
            
            TablaProducto.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Producto
    public void ShowDataProducto(String campo, String dato) throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM PRODUCTOS WHERE "+campo+"="+dato+"";
            Statement st = Conexion.createStatement();
            ResultSet rstb = st.executeQuery(Query);
            ResultSetMetaData rsmd = rstb.getMetaData();
            
            int col = rsmd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel(); // CRea un modelo del JTable
            
            for(int i=1; i<=col; i++){ // Se agregan los titulos de JTable
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            
            while(rstb.next()){
                String fila[] = new String[col];
                
                for(int j=0; j<col; j++){
                    fila[j] = rstb.getString(j+1);
                }
                
                modelo.addRow(fila);
            }
            
            TablaProducto.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }

// Mostrar los datos a buscar en el ComboBox    
    public void ShowDataBoxSearchProducto() throws SQLException{
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM PRODUCTOS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            Box_BuscarP.removeAllItems();
            
            for(int i=1; i<=col; i++){ 
                Box_BuscarP.addItem(rsmd.getColumnLabel(i));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }

//Eliminar Registro de la Tabla Producto    
    public void DeleteDataProducto(String ID) throws SQLException {  
        
        cnx.MySQLCnx();
        
        try {
            
            String Query = "DELETE FROM PRODUCTOS WHERE idPRODUCTOS="+ID+"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            
            System.out.println("Borrado..");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
        
        cnx.CloseCnx();
    }
    
//Buscar Productos
    public void SearchDataProducto(String Busca, String Cadena) throws SQLException {     
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM PRODUCTOS WHERE "+Busca+" ="+Cadena+"";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            
            System.out.println("Buscado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        cnx.CloseCnx();
    }
    
}
