package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Audio extends AudioVisual{

    public Audio (){
    }

    public Audio(int signatura, LocalDate fechaCompra, boolean restringido, String tema, String formato, int duracion, String idioma) {
        super(signatura, fechaCompra, restringido, tema, formato, duracion, idioma);
    }

    public Audio(String currentLine) {
    }

    @Override
    public String toString() {
        return "Audio{" +
                "formato='" + formato + '\'' +
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
        return "Audio{" +
                "formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }
}
