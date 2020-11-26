package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Profesor extends Persona{

    private String contrato;
    private LocalDate fechaContratacion;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Profesor(){
    }

    public Profesor(String contrato, LocalDate fechaContratacion) {
        this.contrato = contrato;
        this.fechaContratacion = fechaContratacion;
    }

    public Profesor(int cedula, String nombre, String apellido, String contrato, LocalDate fechaContratacion) {
        super(cedula, nombre, apellido);
        this.contrato = contrato;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "contrato='" + contrato + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Profesor{" +
                "contrato='" + contrato + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
