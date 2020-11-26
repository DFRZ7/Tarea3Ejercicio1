package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Video extends AudioVisual{

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Video(){
    }

    public Video(String director) {
        this.director = director;
    }

    public Video(String formato, int duracion, String idioma, String director) {
        super(formato, duracion, idioma);
        this.director = director;
    }

    public Video(int signatura, LocalDate fechaCompra, boolean restringido, String tema, String formato, int duracion, String idioma, String director) {
        super(signatura, fechaCompra, restringido, tema, formato, duracion, idioma);
        this.director = director;
    }

    @Override
    public String toString() {
        return "Video{" +
                "director='" + director + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Video{" +
                "director='" + director + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }
}
