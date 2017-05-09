/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VEmpleado.Box_BuscarE;
import static Ventanas.VEmpleado.TablaEmpleado;
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
public class Empleado {
    
    MySQL cnx = new MySQL();
    
//Insertar Datos en la Tabla Empleado    
    public void InsertEmpleado(String Nombre, String Apellidos, String Cargo) throws SQLException{
        
        cnx.MySQLCnx();
        
        String CargoID = null;
        
        try{
            
            String Ct = "SELECT * FROM CARGOS WHERE NOMBRE='"+Cargo+"'";
            Statement st = Conexion.createStatement();
            ResultSet rst = st.executeQuery(Ct);
            rst.next();
            
            CargoID = String.valueOf(rst.getInt("idCARGO"));
                        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
        }
        
        try{
                        
            String Query = "INSERT INTO EMPLEADOS (idEMPLEADOS,NOMBRE,APELLIDOS,idCARGO,ALMACEN_NIT) VALUES(idEMPLEADOS,'"+Nombre+"','"+Apellidos+"','"+CargoID+"',1234567890)";
            
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error en almacenamiento de datos...");
            System.err.println(ex.getMessage());            
        }
        
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Empleado
    public void ShowDataEmpleado() throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM EMPLEADOS";
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
            
            TablaEmpleado.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }
    
//Mostrar Datos de la Tabla Empleados Sobrecargado
    public void ShowDataEmpleado(String campo, String dato) throws SQLException {
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM EMPLEADOS WHERE "+campo+"="+dato+"";
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
            
            TablaEmpleado.setModel(modelo);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }

// Mostrar los datos a buscar en el ComboBox    
    public void ShowDataBoxSearchEmpleado() throws SQLException{
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM EMPLEADOS";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            Box_BuscarE.removeAllItems();
            
            for(int i=1; i<=col; i++){ 
                Box_BuscarE.addItem(rsmd.getColumnLabel(i));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        cnx.CloseCnx();
    }

//Eliminar Registro de la Tabla Empleados    
    public void DeleteDataEmpleado(String DNI) throws SQLException {  
        
        cnx.MySQLCnx();
        
        try {
            
            String Query = "DELETE FROM EMPLEADOS WHERE DNI="+DNI+"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            
            System.out.println("Borrado..");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
        
        cnx.CloseCnx();
    }
    
//Buscar Empleados
    public void SearchDataEmpleado(String Busca, String Cadena) throws SQLException {     
        
        cnx.MySQLCnx();
        
        try {
            String Query = "SELECT * FROM EMPLEADOS WHERE "+Busca+" ="+Cadena+"";
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
