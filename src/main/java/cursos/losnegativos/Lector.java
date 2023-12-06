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
import java.util.Optional;

public class Lector {
    // Atributos
    private int numSocio;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Optional<Multa> multa;
    private ArrayList<Copia> copiasPrestadas;

    // Constructor
    public Lector(int numSocio, String nombres, String apellidos, String direccion) {
        this.numSocio = numSocio;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.multa = Optional.empty();
        this.copiasPrestadas = new ArrayList<>();
    }

    // Método para comprobar multas pendientes
    public boolean comprobarMultasPendientes() {
        return multa.isPresent();
    }

    // Método para prestar una copia al lector
    public void prestarCopia(Copia copia) {
        if (copiasPrestadas.size() < 3) {
            copiasPrestadas.add(copia);
            System.out.println("Copia prestada al lector.");
        } else {
            System.out.println("El lector ya tiene 3 copias prestadas.");
        }
    }
}
