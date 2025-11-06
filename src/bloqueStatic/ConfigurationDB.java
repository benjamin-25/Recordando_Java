package bloqueStatic;

public class ConfigurationDB {

    static final String USER;
    static final String URL;

    /* dentro de un bloque estatico no pueden haber llamados a atributos de instancia*/
    static {
        URL = "";
        USER = "admin";
        System.out.println("variables inicializadas...");
    }

    public static void main(String[] args) {
        System.out.println("Conexion: " + URL);
        System.out.println("Usuario: " + USER);
    }
}
