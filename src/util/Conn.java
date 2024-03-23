/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author arthu
 */
public class Conn {
    public static Connection getConn(){
        try {
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/redencao", "root", "Mari@@010304");
               System.out.println("Conectado ao banco de dados com sucesso!");
               return conn;
        } catch(SQLException e){
            System.out.println("Erro ao conectar ao banco de dados!\nErro: " + e);
        }
                return null;
    } public static void main (String[] args){
        Conn.getConn();
        
    }
}
