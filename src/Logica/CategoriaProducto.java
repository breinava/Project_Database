/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VCategoriaProducto.Box_BuscarCP;
import static Ventanas.VCategoriaProducto.TablaCategoriaPD;
import static Ventanas.VProducto.Box_Categoria;
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
public class CategoriaProducto {
    
    MySQL cnx = new MySQL();

//Mostrar Datos de Categorias de Productos en ComboBox de Produtos
    public void ShowDataCategoriaPDBox() throws SQLException{
         
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CATEGORIAS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            Box_Categoria.removeAllItems();
            
            while(rs.next()){
                Box_Categoria.addItem(rs.getString("NOMBRE"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
// Mostrar los datos a buscar en el ComboBox    
    public void ShowDataBoxSearchCategoriaPD() throws SQLException{
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CATEGORIAS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            Box_BuscarCP.removeAllItems();
            
            for(int i=1; i<=col; i++){ 
                Box_BuscarCP.addItem(rsmd.getColumnLabel(i));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Insertar Datos en la Tabla Categoria de producto    
    public void InsertCategoriaPD(String Nombre, String Descripcion) throws SQLException{
        
        cnx.MySQLCnx();
        
        try{
                        
            String Query = "INSERT INTO CATEGORIAS VALUES (idCATEGORIAS,'"+Nombre+"','"+Descripcion+"')";
            
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Categoria de Productos
    public void ShowDataCategoriaPD() throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CATEGORIAS";
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
            
            TablaCategoriaPD.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Categorias de Productos Sobrecargado
    public void ShowDataCategoriaPD(String campo, String dato) throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CATEGORIAS WHERE "+campo+"="+dato+"";
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
            
            TablaCategoriaPD.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Eliminar Registro de la Tabla Categoria de Productos    
    public void DeleteDataCategoriaPD(String ID) throws SQLException {  
        
        cnx.MySQLCnx();
        
        try {
            
            String Query = "DELETE FROM CATEGORIAS WHERE idCATEGORIAS="+ID+"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            
            System.out.println("Borrado..");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
        
        cnx.CloseCnx();
    }
    
//Buscar Categorias de Productos
    public void SearchDataCategoriaPD(String Busca, String Cadena) throws SQLException {     
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CATEGORIAS WHERE "+Busca+" ="+Cadena+"";
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
