import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    public static void crearClienteDB(Cliente cliente) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `dbtienda`.`cliente` (`nombre`, `email`, `telefono`) VALUES (?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getEmail());
                ps.setString(3, cliente.getTelefono());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerClienteDB() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM cliente";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Telefono: " + rs.getString("telefono"));
                System.out.println("***");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void borrarCliente(int id) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM cliente WHERE  id=?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("El cliente ah sido borrado");

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("El cliente no se `puede borrar");
        }
    }catch(SQLException e)

    {
        System.out.println(e);
    }
}

    public static void actualizarCliente(Cliente cliente){
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query = "UPDATE  cliente SET nombre=?, email=?,telefono`=?, WHERE id=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getEmail());
                ps.setString(3, cliente.getTelefono());
                ps.setInt(4, cliente.getId());
                ps.executeUpdate();
                System.out.println("Se actualizo correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
            } catch (SQLException e){
                System.out.println(e);
            }
        }
    }


