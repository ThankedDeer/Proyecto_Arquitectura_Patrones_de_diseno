package org.example;

import org.example.Factory.MysqlConection;
import org.example.Factory.SQLServeConection;
import org.example.Singleton.Singleton;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       MysqlConection objetoConexion = new MysqlConection();
       objetoConexion.conection();

        SQLServeConection sqlServerConection = new  SQLServeConection();
        sqlServerConection.conection();


        /*
        // Obtener la instancia del Singleton
        Singleton singleton = Singleton.getInstance();

        // Obtener la conexión a la base de datos
        Connection connection = singleton.getConnection();

        try {
            Statement statement = connection.createStatement();

            // Ejecutar la consulta SELECT
            ResultSet resultSet = statement.executeQuery("SELECT * FROM frutas");

            // Procesar y mostrar los resultados
            StringBuilder resultText = new StringBuilder("Resultados de la consulta:\n");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String color = resultSet.getString("color");
                String sabor = resultSet.getString("sabor");
                double precio = resultSet.getDouble("precio");

                resultText.append("ID: ").append(id).append(", Nombre: ").append(nombre)
                        .append(", Color: ").append(color).append(", Sabor: ").append(sabor)
                        .append(", Precio: ").append(precio).append("\n");
            }

            // Mostrar los resultados en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, resultText.toString(), "Resultados de la Consulta", JOptionPane.INFORMATION_MESSAGE);

            // Cerrar el ResultSet
            resultSet.close();

            JOptionPane.showMessageDialog(null, "Conexion exitosa a la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, "No se conectó, error: " + e.toString());
        } finally {
            // Cierra la conexión cuando ya no la necesites
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

         */
    }


}