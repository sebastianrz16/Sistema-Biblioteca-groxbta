/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos.losnegativos;

/**
 *
 * @author ruizs
 */


public class Copia {
    // Attributes
    private int identificador;
    private String estado;
    private Lector lector;

    // Constructor
    public Copia(int identificador, String estado) {
        this.identificador = identificador;
        this.estado = estado;
    }

    // Method to return the book copy
    public void devolver() {
        // Implementar lógica para devolver la copia
    }

    // Method to lend the book copy
    public void prestar() {
        // Implementar lógica para prestar la copia
    }
    
    
      public void asociarLector(Lector lector) {
        if (this.lector == null) {
            this.lector = lector;
            // Implementar lógica para asociar la copia al lector
            lector.prestarCopia(this);
        } else {
            System.out.println("La copia ya está asociada a un lector.");
        }
    }
}
