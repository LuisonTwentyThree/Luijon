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
public class Categoria {
    //ATRIBUTOS
    private String tipo;

    public Categoria() {
    }

    public Categoria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Categoria" + "\n Tipo: " + tipo;
    }
    
    
    
}
