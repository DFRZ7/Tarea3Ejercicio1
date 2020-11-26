package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Material;
import java.util.List;

public class AudioVisualFAO extends MateriaFAO{

    @Override
    public boolean save(Material newMaterial) {
        return false;
    }

    @Override
    public List<Material> findAll() {
        return null;
    }

}
