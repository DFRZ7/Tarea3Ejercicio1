package cr.ac.ucenfotec.tarea3.bl.logica;

import cr.ac.ucenfotec.tarea3.bl.entidades.*;
import cr.ac.ucenfotec.tarea3.bl.persistencia.*;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoMaterial;

import java.util.ArrayList;
import java.util.List;

public class GestorMaterial {

    private AudioFAO audioFAO = new AudioFAO();
    private TextoFAO textoFAO = new TextoFAO();
    private VideoFAO videoFAO = new VideoFAO();
    private OtroFAO otroFAO = new OtroFAO();

    public boolean guardar(Material nuevoMaterial) {

        try {
            MateriaFAO objPersistente = determinarObjetoFAO(nuevoMaterial);
            return objPersistente.save(nuevoMaterial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Material> listAll (TipoMaterial tipoMaterial) {
        try{
            MateriaFAO objPersistente = determinarObjetoFAO(tipoMaterial);
            return  objPersistente.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private MateriaFAO determinarObjetoFAO(Material nuevoMaterial) throws Exception {

        if (nuevoMaterial instanceof Audio) {
            return this.audioFAO;
        }
        if (nuevoMaterial instanceof Video) {
            return this.videoFAO;
        }
        if (nuevoMaterial instanceof Texto) {
            return this.textoFAO;
        }
        if (nuevoMaterial instanceof Otro) {
            return this.otroFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

    private MateriaFAO determinarObjetoFAO(TipoMaterial tipo) throws Exception {

        if (TipoMaterial.AUDIO.equals (tipo)) {
            return this.audioFAO;
        }
        if (TipoMaterial.VIDEO.equals (tipo)) {
            return this.videoFAO;
        }
        if (TipoMaterial.TEXTO.equals (tipo)) {
            return this.textoFAO;
        }
        if (TipoMaterial.OTRO.equals(tipo)) {
            return this.otroFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

}
