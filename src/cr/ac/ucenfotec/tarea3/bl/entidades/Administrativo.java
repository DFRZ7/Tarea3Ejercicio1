package cr.ac.ucenfotec.tarea3.bl.entidades;

import cr.ac.ucenfotec.tarea3.bl.interfaces.SerializacionCSV;

public class Administrativo extends Persona{

    private String nombramiento;
    private int horasSemanales;

    public String getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Administrativo (){
    }

    public Administrativo(String nombramiento, int horasSemanales) {
        this.nombramiento = nombramiento;
        this.horasSemanales = horasSemanales;
    }

    public Administrativo(int cedula, String nombre, String apellido, String nombramiento, int horasSemanales) {
        super(cedula, nombre, apellido);
        this.nombramiento = nombramiento;
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombramiento='" + nombramiento + '\'' +
                ", horasSemanales=" + horasSemanales +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Administrativo{" +
                "nombramiento='" + nombramiento + '\'' +
                ", horasSemanales=" + horasSemanales +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
