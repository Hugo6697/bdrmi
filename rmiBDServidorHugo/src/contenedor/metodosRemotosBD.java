
package contenedor;

import conexion.conectar;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Hp
 */
public class metodosRemotosBD extends UnicastRemoteObject implements interfacesBD{
    boolean respuesta;
    
    public metodosRemotosBD()throws RemoteException{
        
    }
    
    @Override
    public boolean metodoRegistrar( String nombre, String telefono, String sexo) throws RemoteException {
        try {
            conectar con=new conectar();
            con.realizarConexion();
            if (con.registrar(nombre, telefono, sexo)) {
                respuesta=true;
                System.out.println("Servidor agrego un nuevo Registro");
            }
            else 
            {
                respuesta=false;
            }
        } catch (Exception e) {
            respuesta=false;
        }
        return respuesta;
    }
    
}
