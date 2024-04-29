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
<<<<<<< HEAD
    String port = "23577";
    String host = "mysql-ondaverde-loginpage-6f2a.h.aivencloud.com";
    String password = "AVNS_qeyAl-SErExLAAt5FCH";
    String database = "defaultdb";
    String user = "avnadmin";
=======
    String port = "3306";
    String host = "localhost";
    String password = "456123000";
    String database = "ControleDeAcesso";
    String user = "root";
>>>>>>> 6ad771f541690cb3b9787faf885ada4a7f4db788
    
    Connection conectar() throws Exception{
        
       var stringConexao = String.format(
<<<<<<< HEAD
            "jdbc:sql://%s:%s/%s",
=======
            "jdbc:postgresql://%s:%s/%s",
>>>>>>> 6ad771f541690cb3b9787faf885ada4a7f4db788
            host, port, database   
       );
    return DriverManager.getConnection(
            stringConexao, user, password
        );
                    }
    
}
