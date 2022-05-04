/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.clases;

import farmacia_olimpo_p2_prc4.conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jarvi
 */
public class Empleado {
     
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String email;
    private final Connection cnn;
    

    public Empleado() {
 
     cnn = Conexion.Conectar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apellido;
    }

    public void setApelido(String apelido) {
        this.apellido = apelido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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

    public String GuardarEmpleado() {
        String resultado = "El registro se guardo con exito";
        try {
            CallableStatement cmst = cnn.prepareCall("CALL InsertarEmpleados(?,?,?,?,?)");
            cmst.setString(1, nombre);
            cmst.setString(2, apellido);
            cmst.setString(3, telefono);
            cmst.setString(4, direccion);
            cmst.setString(5, email);
            cmst.execute();
            cnn.close();
        } catch (SQLException e) {
            resultado = " No se realizo la operacion " + e.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }

    public void ActualizarEmpleado() {

    }

    public void EliminarEmpleado() {

    }

    public void SeleccionarEmpleado() {

    }

    public void BuscarEmpleado(int id) {

    }

}
