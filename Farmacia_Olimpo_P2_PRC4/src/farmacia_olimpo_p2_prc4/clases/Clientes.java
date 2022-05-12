/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.clases;

import farmacia_olimpo_p2_prc4.conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jarvi
 */
public class Clientes {
    private String Modificar = "CALL ModificarClientes(?,?,?,?,?,?)";
    private String Eliminar = "CALL BorrarClientes(?)";
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String email;
    private String vistaemple = "select * from clientes";
    private int Columnas = 0;
    private Connection cnn;
    
    
    /*GETTER AND SETTER*/
    public Clientes() {
         cnn = Conexion.getConexion();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getVistaemple() {
        return vistaemple;
    }
    
     public String getModificar() {
        return Modificar;
    }

    public void setModificar(String Modificar) {
        this.Modificar = Modificar;
    }
     public String getEliminar() {
        return Eliminar;
    }

    public void setEliminar(String Eliminar) {
        this.Eliminar = Eliminar;
    }
    
    /*VISTA DE TABLA*/
    
    public void setVistaemple(String vistaemple) {
        this.vistaemple = vistaemple;
    } 
    
    
    public DefaultTableModel CargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            Connection cnn;
            cnn = Conexion.getConexion();
            Statement smt = cnn.createStatement();
            ResultSet rs = smt.executeQuery(getVistaemple());
            ResultSetMetaData md = rs.getMetaData();
            int columnas = md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(md.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                fila = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    public String NuevoCliente() {
        String resultado;
        try {
            CallableStatement cmst = cnn.prepareCall("CALL InsertarClientes(?,?,?,?,?)");  
            cmst.setString(1,nombre);
            cmst.setString(2,apellido);
            cmst.setInt(3,telefono);
            cmst.setString(4,direccion);
            cmst.setString(5,email);
            cmst.execute();
            resultado = " Los datos se ingresaron exitosamente !!!";
            
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }
    
    
    
    public String EliminarDatos(int id) {
        String resultado;
        try {
            cnn = Conexion.getConexion();
            CallableStatement cmst = cnn.prepareCall(getEliminar());
            cmst.setInt(1, id);
            cmst.execute();
            resultado = "Los datos se eliminaron correctamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
    
    
    public String ModificarDatos(int id, String nombre, String apellido, int telefono, String direccion, String email) {
        String resultado;
        try {
            cnn = Conexion.getConexion();
            CallableStatement cmst = cnn.prepareCall(getModificar());
            cmst.setInt(1, id);
            cmst.setString(2, nombre);
            cmst.setString(3, apellido);
            cmst.setInt(4, telefono);
            cmst.setString(5, direccion);
            cmst.setString(6, email);
            cmst.execute();
            resultado = "Los datos se modificaron correctamente !!!";
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
    
}
