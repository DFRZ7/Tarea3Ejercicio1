package cr.ac.ucenfotec.tarea3.bl.entidades;

public class Estudiante extends Persona{

    private int carne;
    private String carrera;
    private int creditos;

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Estudiante(String currentLine){
    }

    public Estudiante(String nombre, String apellido, int carne, String carrera, int creditos){
        super(nombre, apellido);
        this.carne = carne;
        this.carrera = carrera;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carne=" + carne +
                ", carrera='" + carrera + '\'' +
                ", creditos=" + creditos +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return "Estudiante{" +
                "carne=" + carne +
                ", carrera='" + carrera + '\'' +
                ", creditos=" + creditos +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
