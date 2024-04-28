/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Junior
 */
public class ConnectionFactory {
    String port = "3306";
    String host = "localhost";
    String password = "456123000";
    String database = "ControleDeAcesso";
    String user = "root";
    
    Connection conectar() throws Exception{
        
       var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database   
       );
    return DriverManager.getConnection(
            stringConexao, user, password
        );
                    }
    
}
