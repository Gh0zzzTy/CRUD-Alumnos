/**
 * 
 */
package persistencia;

import entidad.AlumnoEntidad;
import java.util.List;

/**
 *
 * @author CarlosGarcia
 */
public interface IAlumnoDAO {
    public List<AlumnoEntidad> buscarAlumnosTabla() throws PersistenciaException;
    
//    public AlumnoEntidad buscarPorIdAlumno(int id) throws PersistenciaException;
    
}
