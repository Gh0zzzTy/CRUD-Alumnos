/**
 * 
 */
package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author CarlosGarcia
 */

public interface IConexionBD {
    public Connection crearConexion() throws SQLException;
}
