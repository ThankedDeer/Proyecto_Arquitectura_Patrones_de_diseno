package org.example.Factory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServeConection implements Conection {

    Connection SQLServerConection = null;
    String usuario = "sa";
    String contrasena = "211068";
    String bd = "patron_diseno";
    String ip = "localhost";
    String puerto = "1433";

    String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + bd;


    @Override
    public Connection conection() {
        try {
            // Cargar el controlador JDBC de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión a SQL Server
            SQLServerConection = DriverManager.getConnection(cadena, usuario, contrasena);

            JOptionPane.showMessageDialog(null, "Se conecto correctamente a SQL Server");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó, error: " + e.toString());
            System.out.println(e.toString());
        }

        return SQLServerConection;
    }

}
