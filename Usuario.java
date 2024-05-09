/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorproyecto;
import static javax.swing.JOptionPane.*;
/**
 *
 * @Karla Natalia Jara
 */
public class Usuario {
    //ATRIBUTOS
    private String nombreUsuario;
    private String correoUsuario;
    private String celular;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String correoUsuario, String celular, int edad) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.celular = celular;
        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario" 
                + "\n Nombre del Usuario: " + nombreUsuario 
                + "\n Correo: " + correoUsuario 
                + "\n Celular: " + celular 
                + "\n Edad: " + edad;
    }
    
    
    
    
    
    
    
    
    
}
