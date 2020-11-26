package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Otro extends Material{

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Otro (){
    }

    public Otro(String descripcion) {
        this.descripcion = descripcion;
    }

    public Otro(int signatura, LocalDate fechaCompra, boolean restringido, String tema, String descripcion) {
        super(signatura, fechaCompra, restringido, tema);
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Otro{" +
                "descripcion='" + descripcion + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Otro{" +
                "descripcion='" + descripcion + '\'' +
                ", Signatura=" + Signatura +
                ", fechaCompra=" + fechaCompra +
                ", Restringido=" + Restringido +
                ", tema='" + tema + '\'' +
                '}';
    }
}
