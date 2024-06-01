package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 
@author Junior*/
public class ConnectionFactory {
    String host = "pg-3d883949-pandabr4ndow.a.aivencloud.com";
    String port = "27641";
    String user = "avnadmin";
    String password = "AVNS_wf_Mhhl4UkbKI3y0zO3";
    String database = "defaultdb";

    Connection conectar() throws Exception{

            var stringConexao = String.format("jdbc:postgresql://%s:%s/%s",host, port, database);

            return DriverManager.getConnection(stringConexao, user, password);


    }
}