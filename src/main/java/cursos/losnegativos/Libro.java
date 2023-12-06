/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos.losnegativos;

/**
 *
 * @author ruizs
 */

import java.util.ArrayList;


public class Libro {
    // Attributes
    private String nombre;
    private String tipo;
    private String editorial;
    private int año;
    private Autor autor;  // Reference to the author of the book
    private ArrayList<Copia> copias;

    // Constructor
    public Libro(String nombre, String tipo, String editorial, int año, Autor autor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
        this.copias = new ArrayList<>();
    }
 

    // Getter methods
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAño() {
        return año;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
    
    //copia  
    public void agregarCopia(Copia copia) {
        copias.add(copia);
    }
}
