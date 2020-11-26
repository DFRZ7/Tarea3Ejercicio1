package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Persona;
import java.util.List;

public abstract class PersonaFAO {

    public abstract boolean save (Persona nuevaPersona);

    public abstract List<Persona> findAll();

}
