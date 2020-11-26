package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class AudioVisual extends Material{

    protected String formato;
    protected int duracion;
    protected String idioma;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public AudioVisual (){
    }

    public AudioVisual(String formato, int duracion, String idioma) {
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public AudioVisual(int signatura, LocalDate fechaCompra, boolean restringido, String tema, String formato, int duracion, String idioma) {
        super(signatura, fechaCompra, restringido, tema);
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    @Override
    public String toCSVLine() {
        return null;
    }
}
