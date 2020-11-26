package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Texto extends Material{

    private String titulo;
    private String nombreAutor;
    private LocalDate fechaPublicacion;
    private int numeroPaginas;
    private String idioma;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Texto (){
    }

    public Texto(String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
    }

    public Texto(int signatura, LocalDate fechaCompra, boolean restringido, String tema, String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        super(signatura, fechaCompra, restringido, tema);
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "titulo='" + titulo + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                ", idioma='" + idioma + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Texto{" +
                "titulo='" + titulo + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                ", idioma='" + idioma + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }
}
