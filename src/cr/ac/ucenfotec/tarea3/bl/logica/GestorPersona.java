package cr.ac.ucenfotec.tarea3.bl.logica;

import cr.ac.ucenfotec.tarea3.bl.entidades.*;
import cr.ac.ucenfotec.tarea3.bl.persistencia.*;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoPersona;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    private EstudianteFAO estudianteFAO = new EstudianteFAO();
    private ProfesorFAO profesorFAO = new ProfesorFAO();
    private AdministrativoFAO administrativoFAO = new AdministrativoFAO();

    public boolean guardar(Persona nuevaPersona) {

        try {
            PersonaFAO objPersistente = determinarObjetoFAO(nuevaPersona);
            return objPersistente.save(nuevaPersona);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Persona> listAll (TipoPersona tipoPersona) {
        try{
            PersonaFAO objPersistente = determinarObjetoFAO(tipoPersona);
            return  objPersistente.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private PersonaFAO determinarObjetoFAO(Persona nuevaPersona) throws Exception {

        if (nuevaPersona instanceof Estudiante) {
            return this.estudianteFAO;
        }
        if (nuevaPersona instanceof Profesor) {
            return this.profesorFAO;
        }
        if (nuevaPersona instanceof Administrativo) {
            return this.administrativoFAO;
        }
        throw new Exception("Tipo de Persona Desconocida!");
    }

    private PersonaFAO determinarObjetoFAO(TipoPersona tipo) throws Exception {

        if (TipoPersona.ESTUDIANTE.equals (tipo)) {
            return this.estudianteFAO;
        }
        if (TipoPersona.PROFESOR.equals (tipo)) {
            return this.profesorFAO;
        }
        if (TipoPersona.ADMINISTRATIVO.equals (tipo)) {
            return this.administrativoFAO;
        }
        throw new Exception("Tipo de Persona Desconocida!");
    }
}
