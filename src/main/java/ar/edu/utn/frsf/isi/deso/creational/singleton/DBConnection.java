package ar.edu.utn.frsf.isi.deso.creational.singleton;

import java.sql.Connection;

public class DBConnection {

    private String usuario = "user";
    private String password = "password";
    private String host = "localhost";
    private String puerto = "3306";
    private String nombreBaseDatos = "test";

    private static DBConnection instancia;

    private DBConnection() {}
    public static DBConnection getInstance() {
        if (instancia == null) {
            instancia = new DBConnection();
        }
        return instancia;
    }

    public Connection connect() {
        // Lógica para conectarse a la base de datos
        System.out.println("Conectando a la base de datos " + nombreBaseDatos + " en " + host + ":" + puerto + " con el usuario " + usuario);
        return null;
    }


}
