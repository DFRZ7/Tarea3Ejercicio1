package cr.ac.ucenfotec.tarea3.ui;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu () {
        output.println("Bienvenido a la Biblioteca, elija una opcion: ");
        output.println("1. Registrar Estudiante");
        output.println("2. Registrar Profesor");
        output.println("3. Registrar Administrativo");
        output.println("4. Registrar Texto");
        output.println("5. Registrar Audio");
        output.println("6. Registar Video");
        output.println("7. Registrar Otro Material");
        output.println("8. Listar Estudiante");
        output.println("9. Listar Profesor");
        output.println("10. Listar Administrativo");
        output.println("11. Listar Texto");
        output.println("12. Listar Audio");
        output.println("13. Listar Video");
        output.println("14. Listar Otro Material");
        output.println("15. Salir");
    }

    public int leerOpcion () {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimir (String msj) {
        output.println(msj);
    }

    public String leerString () {
        return input.next();
    }

    public int leerEntero() {
        return input.nextInt();
    }

}
