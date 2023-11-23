import java.util.Scanner;

public class CilenteService {
    public static void crearCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe tu nombre: ");
        String nombre =juan.nextLine();

        System.out.println("escribe tu email: ");
        String email = juan.nextLine();

        System.out.println("escribe tu telefono: ");
        String telefono = juan.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setEmail(email);
        cliente.setTelefono(telefono);
        ClienteDAO.crearClienteDB(cliente);

    }
    public static void listarCliente(){

    }
    public static void borrarCliente(){

    }
    public static void editarCliente(){

    }
}
