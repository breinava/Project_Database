/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VCliente.TablaCliente;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Ventanas.VCliente.Box_BuscarC;

/**
 *
 * @author breiner
 */
public class Cliente {
    
    MySQL cnx = new MySQL();
        
//Insertar Datos en la Tabla Cliente
    public void InsertCliente(String DNI, String Nombre, String Apellidos, String Telefono, String Email) throws SQLException{
        
        cnx.MySQLCnx();
        
        try{
            String Query = "INSERT INTO CLIENTES VALUES ("
                    +DNI+",'"
                    +Nombre+"','"
                    +Apellidos+"',"
                    +Telefono+",'"
                    +Email+"')";
            
                        
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        cnx.CloseCnx();
    }

//Mostrar Datos de la Tabla Clientes
    public void ShowDataCliente() throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CLIENTES";
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
            
            TablaCliente.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Clientes Sobrecargada
    public void ShowDataCliente(String campo, String dat) throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CLIENTES WHERE "+campo+" ="+dat+"";
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
            
            TablaCliente.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        
        cnx.CloseCnx();
    }    
    
//Eliminar Registro de la Tabla Cliente    
    public void DeleteDataCliente(String DNI) throws SQLException {  
        
        cnx.MySQLCnx();
        
        try {
            
            String Query = "DELETE FROM CLIENTES WHERE DNI="+DNI+"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            
            System.out.println("Borrado..");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
        
        cnx.CloseCnx();
    }

// Mostrar los datos a buscar en el ComboBox    
    public void ShowDataBoxSearchCliente() throws SQLException{
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CLIENTES";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            Box_BuscarC.removeAllItems();
            
            for(int i=1; i<=col; i++){ 
                Box_BuscarC.addItem(rsmd.getColumnLabel(i));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Buscar CLientes
    public void SearchDataCliente(String Busca, String Cadena) throws SQLException {     
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CLIENTES WHERE "+Busca+" ="+Cadena+"";
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


