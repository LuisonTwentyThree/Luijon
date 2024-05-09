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
public class Servicio {
    //ATRIBUTOS
    private String categoria;
    private String estatus;
    private String nombreServicio;
    
    //MÉTODOS

    public Servicio() {
    }

    public Servicio(String categoria, String estatus, String nombreServicio) {
        this.categoria = categoria;
        this.estatus = estatus;
        this.nombreServicio = nombreServicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    @Override
    public String toString() {
        return "Servicio" 
                + "\n Categoria: " + categoria 
                + "\n Estatus: " + estatus 
                + "\n Nombre del Servicio: " + nombreServicio;
    }
    
    
    
    
    
}
