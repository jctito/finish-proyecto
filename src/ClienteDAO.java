import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public static void crearClienteDB(Cliente cliente){
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `dbtienda`.`cliente` (`nombre`, `email`, `telefono`) VALUES (?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,cliente.getNombre());
                ps.setString(2,cliente.getEmail());
                ps.setString(3,cliente.getTelefono());
                ps.executeUpdate();
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerClienteDB(){

    }
    public static  void borrarCliente(int id){

    }
    public static void actualizarCliente(Cliente cliente){

    }
}
