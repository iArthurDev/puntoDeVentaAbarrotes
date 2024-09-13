/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ldoar
 */
public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;
    private String email;
    private String numeroTelefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(String nombreProveedor, String email, String numeroTelefono) {
        this.nombreProveedor = nombreProveedor;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public Proveedor(int idProveedor, String nombreProveedor, String email, String numeroTelefono) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", email=" + email + ", numeroTelefono=" + numeroTelefono + '}';
    }
      
}
