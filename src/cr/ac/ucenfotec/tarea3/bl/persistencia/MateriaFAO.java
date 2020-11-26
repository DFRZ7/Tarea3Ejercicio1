package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Material;
import java.util.List;

public abstract class MateriaFAO {

    public abstract boolean save(Material nuevoMaterial);

    public abstract List<Material> findAll();

}
