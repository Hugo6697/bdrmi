
package contenedor;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Hp
 */
public interface interfacesBD extends Remote{
    public boolean metodoRegistrar(String nombre, String telefono, String sexo ) throws RemoteException;
    
}
