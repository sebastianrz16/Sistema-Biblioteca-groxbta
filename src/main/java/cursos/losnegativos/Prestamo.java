
package cursos.losnegativos;

/**
 *
 * @author ruizs
 */
import java.time.LocalDate;

public class Prestamo {
    // Atributos
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor
    public Prestamo(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Método para calcular la fecha de fin
    public void calcularFechaFin() {
        // Implementar la lógica para calcular la fecha de fin del préstamo
    }

    // Método para generar multa
    public void generarMulta() {
        // Implementar la lógica para generar la multa
    }
}


