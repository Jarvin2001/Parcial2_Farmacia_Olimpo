/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Labderecho03
 */
public class Conexion {

    static String user = "JarvinM";
    static String pass = "Jarvin2001$";
    static String url = "jdbc:mysql://localhost/farmacia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static Connection cnn;

   /*    
    ¿Qué tal usar SSL pero desactivar la verificación del servidor como cuando 
    está en modo de desarrollo en su propia computadora : ?verifyServerCertificate=false&useSSL=true    
    *************
    Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
    Cambios a relizar : com.mysql.cj.jdbc.Driver
   *************
    The server time zone value 'Hora est�ndar, Am�rica Centra' is unrecognized or represents more than one time zone
    Cambios a relizar :?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
  */
    public static Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException cnfex) {
            JOptionPane.showMessageDialog(null, "ConexionMySQL:" + cnfex.getMessage());
            System.out.println(cnfex.getMessage());
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "ConexionMySQL:" + sqlex.getMessage());
            System.out.println(sqlex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ConexionMySQL:" + ex.getMessage());
            System.out.println(ex.getMessage());
        }
        return cnn;
    }

    public void cerrarConexion() {
        try {
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args){
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        
        try{
            st=Conexion.cnn.createStatement();
            rs=st.executeQuery("select *from Empleado");
            while (rs.next()){
                System.out.println(rs.getInt("idempleado")+""+rs.getString("nombre")+""+rs.getString("apellido"));
            }
            cn.cnn.close();
        }
        catch(Exception e){
            
        }
        
    }

}