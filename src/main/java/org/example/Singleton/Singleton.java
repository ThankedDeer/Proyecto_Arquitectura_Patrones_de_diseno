package org.example.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    // La única instancia de la clase
    private static Singleton instance;

    // La conexión a la base de datos
    private Connection connection;

    // Información de conexión a la base de datos
    private static final String IP = "localhost";
    private static final String PUERTO = "3306";
    private static final String BD = "Proyecto_Arquitectura";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "211068";

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton() {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            connection = DriverManager.getConnection(getConnectionString(), USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Puedes manejar las excepciones según tus necesidades
        }
    }

    // Método para obtener la única instancia de la clase
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Método para obtener la conexión a la base de datos
    public Connection getConnection() {
        return connection;
    }

    // Método para construir la cadena de conexión
    private String getConnectionString() {
        return "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BD;
    }
}
