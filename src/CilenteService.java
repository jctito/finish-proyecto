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
        ClienteDAO.leerClienteDB();

    }
    public static void borrarCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("Indique el ID del cliente a borrar: ");
        int id_cliente = juan.nextInt();
        ClienteDAO.borrarCliente(id_cliente);
    }
    public static void editarCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe nuevo nombre ");
        String nombre =juan.nextLine();

        System.out.println("escribe nuevo email ");
        String email =juan.nextLine();

        System.out.println("escribe nuevo telefono ");
        String telefono =juan.nextLine();

        System.out.println("indique el ID del cliente a editar ");
        int  id_cliente =juan.nextInt();

        Cliente  acliente =new Cliente();
        acliente.setNombre(nombre);
        acliente.setEmail(email);
        acliente.setTelefono(telefono);
        acliente.setId(id_cliente);
        ClienteDAO.actualizarCliente(acliente);


    }
}
