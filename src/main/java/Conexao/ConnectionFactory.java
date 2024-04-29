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
    String port = "23577";
    String host = "mysql-ondaverde-loginpage-6f2a.h.aivencloud.com";
    String password = "AVNS_qeyAl-SErExLAAt5FCH";
    String database = "defaultdb";
    String user = "avnadmin";
    
    Connection conectar() throws Exception{
        
       var stringConexao = String.format(
            "jdbc:sql://%s:%s/%s",
            host, port, database   
       );
    return DriverManager.getConnection(
            stringConexao, user, password
        );
                    }
    
}
