public class Inicio {
    public static void main(String[] args) {
        System.out.println("hola bolivia");
        Conexion conexion =new Conexion();
        try{
            conexion.get_conConnection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
