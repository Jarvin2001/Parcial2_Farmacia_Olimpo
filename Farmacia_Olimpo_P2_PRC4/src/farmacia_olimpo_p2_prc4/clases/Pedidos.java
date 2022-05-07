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
public class Pedidos {
     
    private String nombre;
    private String precio;
    private String stock;
    private String descripcion;
    private final Connection cnn;
    

    public Pedidos() {
 
     cnn = Conexion.Conectar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String GuardarPedido() {
        String resultado = "El registro se guardo con exito";
        try {
            CallableStatement cmst = cnn.prepareCall("CALL InsertarEmpleados(?,?,?,?)");
            cmst.setString(1, nombre);
            cmst.setString(2, precio);
            cmst.setString(3, stock);
            cmst.setString(4, descripcion);
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

    public void ActualizarPeido() {

    }

    public void EliminarPedido() {

    }

    public void SeleccionarPedido() {

    }

    public void BuscarPedido(int id) {

    }

}