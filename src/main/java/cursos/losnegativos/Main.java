
package cursos.losnegativos;



import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Inicialización de listas y objetos (Libros, Autores, Copias, etc.)
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        ArrayList<Multa> multas = new ArrayList<>();
        ArrayList<Copia> copias = new ArrayList<>();

        // Creación de objetos Libro, Autor, Copia, etc.
        Libro libro1 = new Libro("ISBN123", "Título del Libro 1");
        Libro libro2 = new Libro("ISBN456", "Título del Libro 2");

        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");

        Copia copia1 = new Copia(1, libro1);
        Copia copia2 = new Copia(2, libro2);

        Lector lector1 = new Lector(1, "Nombre Lector 1", "Apellido Lector 1", "Dirección Lector 1");
        Lector lector2 = new Lector(2, "Nombre Lector 2", "Apellido Lector 2", "Dirección Lector 2");

        Prestamo prestamo1 = new Prestamo(lector1, copia1);
        Prestamo prestamo2 = new Prestamo(lector2, copia2);

        Multa multa1 = new Multa(prestamo1);
        Multa multa2 = new Multa(prestamo2);

        // Agregar objetos a las listas correspondientes
        libros.add(libro1);
        libros.add(libro2);

        autores.add(autor1);
        autores.add(autor2);

        copias.add(copia1);
        copias.add(copia2);

        prestamos.add(prestamo1);
        prestamos.add(prestamo2);

        multas.add(multa1);
        multas.add(multa2);

        // Definición de rutas Spark para el sistema bibliotecario
        get("/libros", (req, res) -> {
            res.type("application/json");
            return gson.toJson(libros);
        });

        get("/autores", (req, res) -> {
            res.type("application/json");
            return gson.toJson(autores);
        });

        // Resto de las rutas Spark...

    }
}
