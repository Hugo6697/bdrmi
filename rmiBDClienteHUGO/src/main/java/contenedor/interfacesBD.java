
package contenedor;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Hp
 */
public interface interfacesBD extends Remote{
    public boolean metodoRegistrar(int control,String nombre, String telefono) throws RemoteException;

    public boolean metodoRegistrar(String nombre, String telefono, String sexo);
    
}
