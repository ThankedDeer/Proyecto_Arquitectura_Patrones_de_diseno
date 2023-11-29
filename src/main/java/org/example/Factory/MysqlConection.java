package org.example.Factory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class MysqlConection implements Conection {

    Connection mysqlConection = null;
    String usuario = "root";
    String contrasena = "211068";
    String bd = "Proyecto_Arquitectura";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;


    @Override
    public Connection conection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlConection= DriverManager.getConnection(cadena,usuario,contrasena);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a Mysql  ");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se conecto, error: " + e.toString());

        }

        return mysqlConection;
    }


}
