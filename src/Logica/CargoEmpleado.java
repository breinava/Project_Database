/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VCargoEmpleado.Box_BuscarCE;
import static Ventanas.VCargoEmpleado.TablaCargoEMP;
import static Ventanas.VEmpleado.Box_CargoE;
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
public class CargoEmpleado {
        
    MySQL cnx = new MySQL();

//Mostrar Datos de Cargos de empleados en ComboBox de Empleados
    public void ShowDataCargoEMPBox() throws SQLException{
         
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CARGOS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            Box_CargoE.removeAllItems();
            
            while(rs.next()){
                Box_CargoE.addItem(rs.getString("NOMBRE"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }

// Mostrar los datos a buscar en el ComboBox    
    public void ShowDataBoxSearchCargoEMP() throws SQLException{
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CARGOS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            Box_BuscarCE.removeAllItems();
            
            for(int i=1; i<=col; i++){ 
                Box_BuscarCE.addItem(rsmd.getColumnLabel(i));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Insertar Datos en la Tabla Cargo de Emmpleado    
    public void InsertCargoEMP(String Nombre) throws SQLException{
        
        cnx.MySQLCnx();
        
        try{
                        
            String Query = "INSERT INTO CARGOS VALUES (idCARGO,'"+Nombre+"')";
            
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Empleado
    public void ShowDataCargoEMP() throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CARGOS";
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
            
            TablaCargoEMP.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Cargo de empleados Sobrecargado
    public void ShowDataCargoEMP(String campo, String dato) throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CARGOS WHERE "+campo+"="+dato+"";
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
            
            TablaCargoEMP.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Eliminar Registro de la Tabla Cargo de Empleados    
    public void DeleteDataCargoEMP(String ID) throws SQLException {  
        
        cnx.MySQLCnx();
        
        try {
            
            String Query = "DELETE FROM CARGOS WHERE idCARGO="+ID+"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            
            System.out.println("Borrado..");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
        
        cnx.CloseCnx();
    }
    
//Buscar Cargo de Empleados
    public void SearchDataCargoEMP(String Busca, String Cadena) throws SQLException {     
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM CARGOS WHERE "+Busca+" ="+Cadena+"";
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
