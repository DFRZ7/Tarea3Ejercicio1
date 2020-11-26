package cr.ac.ucenfotec.tarea3.controlador;

import cr.ac.ucenfotec.tarea3.bl.entidades.*;
import cr.ac.ucenfotec.tarea3.bl.logica.GestorMaterial;
import cr.ac.ucenfotec.tarea3.bl.logica.GestorPersona;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoMaterial;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoPersona;
import cr.ac.ucenfotec.tarea3.ui.UI;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;

public class Controlador {

     private final UI interfaz = new UI();
     private final GestorMaterial gestorMaterial = new GestorMaterial();
     private final GestorPersona gestorPersona = new GestorPersona();

     public void ejecutarPrograma(){
         int op;
         do {
             interfaz.mostrarMenu();
             op = interfaz.leerOpcion();
             procesarOpcion(op);
         } while (op != 15);
     }

     public void procesarOpcion (int op) {
         switch (op) {
             case 1 -> registrarEstudiante();
             case 2 -> registrarProfesor();
             case 3 -> registrarAdministrativo();
             case 4 -> registrarTexto();
             case 5 -> registrarAudio();
             case 6 -> registrarVideo();
             case 7 -> registrarOtro();
             case 8 -> listarEstudiante();
             case 9 -> listarProfesor();
             case 10 -> listarAdministrativo();
             case 11 -> listarTexto();
             case 12 -> listarAudio();
             case 13 -> listarVideo();
             case 14 -> listarOtro();
             case 15 -> {
                 interfaz.imprimir("Gracias, te esperamos pronto!");
                 System.exit(0);
             }
             default -> System.out.println("Opcion desconocida!");
         }
     }

     private void registrarEstudiante() {
         interfaz.imprimir("Nombre?");
         String nombre = interfaz.leerString();
         interfaz.imprimir("Apellido?");
         String apellido = interfaz.leerString();
         interfaz.imprimir("Carne?");
         int carne = interfaz.leerEntero();
         interfaz.imprimir("Carrera?");
         String carrera = interfaz.leerString();
         interfaz.imprimir("Credito?");
         int credito = interfaz.leerEntero();
         Estudiante estudianteTemporal = new Estudiante(nombre, apellido, carne, carrera, credito);
         gestorPersona.guardar(estudianteTemporal);
     }

    private void registrarProfesor() {
         interfaz.imprimir("Cedula?");
         int cedula = interfaz.leerEntero();
         interfaz.imprimir("Nombre?");
         String nombre = interfaz.leerString();
         interfaz.imprimir("Apellido?");
         String apellido = interfaz.leerString();
         interfaz.imprimir("Contrato?");
         String contrato = interfaz.leerString();
         interfaz.imprimir("Fecha de Contratacion? (Ejemplo: 08-11-2020)");
         String fechaContratacion = interfaz.leerString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
         LocalDate fecha = LocalDate.parse(fechaContratacion, formatter);
         Profesor profesorTemporal = new Profesor(cedula, nombre, apellido, contrato, fecha);
         gestorPersona.guardar(profesorTemporal);
    }

    private void registrarAdministrativo() {
        interfaz.imprimir("Cedula?");
        int cedula = interfaz.leerEntero();
        interfaz.imprimir("Nombre?");
        String nombre = interfaz.leerString();
        interfaz.imprimir("Apellido?");
        String apellido = interfaz.leerString();
        interfaz.imprimir("Nombramiento?");
        String nombramiento = interfaz.leerString();
        interfaz.imprimir("Horas Semanales?");
        int horasSemanales = interfaz.leerEntero();
        Administrativo administrativoTemporal = new Administrativo(cedula, nombre, apellido, nombramiento, horasSemanales);
        gestorPersona.guardar(administrativoTemporal);
    }

    private void registrarTexto() {
        interfaz.imprimir("Signatura ID?");
        int signatura = interfaz.leerEntero();
        interfaz.imprimir("Fecha de Compra? (Ejemplo: 08-11-2020)");
        String fechaC = interfaz.leerString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate fechaCompra = LocalDate.parse(fechaC, formatter);
        interfaz.imprimir("Restringido? 1 (Si)  - 2 (No)");
        int valorRestringido = interfaz.leerEntero();
        boolean restringido;
        restringido = valorRestringido == 1;
        interfaz.imprimir("Tema?");
        String nombre = interfaz.leerString();
        interfaz.imprimir("Titulo?");
        String apellido = interfaz.leerString();
        interfaz.imprimir("Nombre del Autor?");
        String nombreAutor = interfaz.leerString();
        interfaz.imprimir("Fecha de Publicacion? (Ejemplo: 08-11-2020)");
        String fechaP = interfaz.leerString();
        LocalDate fechaPublicacion = LocalDate.parse(fechaP, formatter);
        interfaz.imprimir("Numero de Paginas?");
        int numeroPaginas = interfaz.leerEntero();
        interfaz.imprimir("Idioma?");
        String idioma = interfaz.leerString();
        Texto textoTemporal = new Texto(signatura, fechaCompra, restringido, nombre, apellido, nombreAutor, fechaPublicacion, numeroPaginas, idioma);
        gestorMaterial.guardar(textoTemporal);
     }

    private void registrarAudio() {
        interfaz.imprimir("Signatura ID?");
        int signatura = interfaz.leerEntero();
        interfaz.imprimir("Fecha de Compra? (Ejemplo: 08-11-2020)");
        String fechaC = interfaz.leerString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate fechaCompra = LocalDate.parse(fechaC, formatter);
        interfaz.imprimir("Restringido? 1 (Si)  - 2 (No)");
        int valorRestringido = interfaz.leerEntero();
        boolean restringido;
        restringido = valorRestringido == 1;
        interfaz.imprimir("Tema?");
        String tema = interfaz.leerString();
        interfaz.imprimir("Formato?");
        String formato = interfaz.leerString();
        interfaz.imprimir("Duracion? (Minutos)");
        int duracion = interfaz.leerEntero();
        interfaz.imprimir("Idioma?");
        String idioma = interfaz.leerString();
        Audio audioTemporal = new Audio(signatura, fechaCompra, restringido, tema, formato, duracion, idioma);
        gestorMaterial.guardar(audioTemporal);
    }

    private void registrarVideo() {
        interfaz.imprimir("Signatura ID?");
        int signatura = interfaz.leerEntero();
        interfaz.imprimir("Fecha de Compra? (Ejemplo: 08-11-2020)");
        String fechaC = interfaz.leerString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate fechaCompra = LocalDate.parse(fechaC, formatter);
        interfaz.imprimir("Restringido? 1 (Si)  - 2 (No)");
        int valorRestringido = interfaz.leerEntero();
        boolean restringido;
        restringido = valorRestringido == 1;
        interfaz.imprimir("Tema?");
        String tema = interfaz.leerString();
        interfaz.imprimir("Formato?");
        String formato = interfaz.leerString();
        interfaz.imprimir("Duracion? (Minutos)");
        int duracion = interfaz.leerEntero();
        interfaz.imprimir("Idioma?");
        String idioma = interfaz.leerString();
        interfaz.imprimir("Director?");
        String director = interfaz.leerString();
        Video videoTemporal = new Video(signatura, fechaCompra, restringido, tema, formato, duracion, idioma, director);
        gestorMaterial.guardar(videoTemporal);
    }

    private void registrarOtro() {
        interfaz.imprimir("Signatura ID?");
        int signatura = interfaz.leerEntero();
        interfaz.imprimir("Fecha de Compra? (Ejemplo: 08-11-2020)");
        String fechaC = interfaz.leerString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate fechaCompra = LocalDate.parse(fechaC, formatter);
        interfaz.imprimir("Restringido? 1 (Si)  - 2 (No)");
        int valorRestringido = interfaz.leerEntero();
        boolean restringido;
        restringido = valorRestringido == 1;
        interfaz.imprimir("Tema?");
        String tema = interfaz.leerString();
        interfaz.imprimir("Descripcion:");
        String descripcion = interfaz.leerString();
        Otro otroTemporal = new Otro(signatura, fechaCompra, restringido, tema, descripcion);
        gestorMaterial.guardar(otroTemporal);
    }

    private void listarEstudiante() {
         gestorPersona.listAll(TipoPersona.ESTUDIANTE);
    }

    private void listarProfesor() {
        gestorPersona.listAll(TipoPersona.PROFESOR);
    }

    private void listarAdministrativo() {
        gestorPersona.listAll(TipoPersona.ADMINISTRATIVO);
    }

    private void listarTexto() {
        gestorMaterial.listAll(TipoMaterial.TEXTO);
    }

    private void listarAudio() {
        gestorMaterial.listAll(TipoMaterial.AUDIO);
    }

    private void listarVideo() {
        gestorMaterial.listAll(TipoMaterial.VIDEO);
    }

    private void listarOtro() {
        gestorMaterial.listAll(TipoMaterial.OTRO);
    }

}
