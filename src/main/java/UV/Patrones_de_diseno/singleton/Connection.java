package UV.Patrones_de_diseno.singleton;

public class Connection {

    private static Connection connection = null;
    private String usuario;
    private String contraseña;

    private Connection() {
        System.out.println("CONEXION CREADA");
        System.out.println("SE HA ABIERTO LA CONEXIÓN");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public static Connection getConnection() {
        if (connection == null) 
            connection = new Connection();
  
        return connection;
    }
    
    public void estado() {
        System.out.println("CONEXION ABIERTA" + " nombre: " + usuario + " contraseña: " + contraseña);
    } 
    
    
}