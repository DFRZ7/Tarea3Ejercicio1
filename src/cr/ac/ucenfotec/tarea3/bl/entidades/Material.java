package cr.ac.ucenfotec.tarea3.bl.entidades;

import cr.ac.ucenfotec.tarea3.bl.interfaces.SerializacionCSV;
import java.time.LocalDate;

public abstract class Material implements SerializacionCSV {

    protected int Signatura;
    protected LocalDate fechaCompra;
    protected boolean Restringido;
    protected String tema;

    public int getSignatura() {
        return Signatura;
    }

    public void setSignatura(int signatura) {
        Signatura = signatura;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isRestringido() {
        return Restringido;
    }

    public void setRestringido(boolean restringido) {
        Restringido = restringido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Material() {
    }

    public Material(int signatura, LocalDate fechaCompra, boolean restringido, String tema) {
        Signatura = signatura;
        this.fechaCompra = fechaCompra;
        Restringido = restringido;
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Material{" +
                "Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }

}
