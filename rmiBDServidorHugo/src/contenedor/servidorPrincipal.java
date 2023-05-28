
package contenedor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class servidorPrincipal {
    public static void main(String[] args) {
        try {
            Registry miRegistro=LocateRegistry.createRegistry(5555);
            miRegistro.rebind("servidorBD", new metodosRemotosBD());
            System.out.println("Servidor iniciado..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+ e.toString());
        }
    }
    
}
