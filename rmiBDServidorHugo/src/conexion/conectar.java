
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Hp
 */
public class conectar {
    
    Connection conexion;
    boolean registroExitoso;
    public void realizarConexion() {
        try {
             //diver de conexion
             Class.forName("org.gjt.mm.mysql.Driver");
             String url, user, password;
             url="jdbc:mysql://localhost/rmitessfp";
             user="root";
             password="";
             conexion=DriverManager.getConnection(url, user, password);
             System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println("ERROR EN LA CONEXION"+e.getMessage());
            conexion=null;
        }
    }
    public boolean registrar(String nombre, String telefono, String sexo) {
        try {
            String sql="insert into cliente values (?,?,?,?)";
            PreparedStatement pst= conexion.prepareStatement(sql);
            pst.setInt(1, 0);
            pst.setString(2, nombre);
            pst.setString(3, telefono);
            pst.setString(4, sexo);
            pst.executeUpdate();
            System.out.println("Agregado..");
            registroExitoso=true;
        } catch (Exception e) {
            registroExitoso=false;
            System.out.println("No agregado");
        }
        return registroExitoso;
    }
    
    
}
