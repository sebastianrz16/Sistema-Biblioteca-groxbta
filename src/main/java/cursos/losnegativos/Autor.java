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

public class Autor {
    // Attributes
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;
    private ArrayList<Libro> libros;  // List of books written by the author

    // Constructor
    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = new ArrayList<>();
    }

    // Getter methods
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    // Method to add a book to the author's list
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}

