/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import MySQL_Conection.MySQL;
import static MySQL_Conection.MySQL.Conexion;
import static Ventanas.VLogin.jPasswordField1;
import static Ventanas.VLogin.txt_Email;
import static Ventanas.VLogin.txt_fullName;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author breiner
 */
public class Login {
    
    MySQL cnx = new MySQL();
    
    // Validar el inicio de secion    
    public int Validar_Login() throws SQLException{
        
        cnx.MySQLCnx();
        
        int sw = 0;
        
        String usuario = txt_fullName.getText();
        String correo = txt_Email.getText();
        String clave = String.valueOf(jPasswordField1.getPassword());
        
        try {
            String SSQL = "SELECT * FROM USERS WHERE USUARIO='"+usuario+"' AND EMAIL='"+correo+"' AND PASS='"+clave+"'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(SSQL);
            
            if(resultSet.next()){
                sw=1;
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        cnx.CloseCnx();
        return sw;
    }
    
}
