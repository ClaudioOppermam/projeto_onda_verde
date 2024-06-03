package Conexao;

import java.sql.Date;
import java.sql.SQLException;
/**
 *
 * @author Alexandre
 */
public class EventoDAO {
        public boolean existe(Evento e) throws Exception {
        var sql = "SELECT * FROM tb_evento nome WHERE nome = ? AND  descricao = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, e.getNome());
        ps.setString(2, e.getDescricao());
        var rs = ps.executeQuery();
        var eventoExiste = rs.next();
        

        rs.close();
        conexao.close();
        ps.close();

        return eventoExiste;
    }
    
    public void create(Evento e) throws Exception{
    
        var sql = "INSERT INTO tb_evento (nome, descricao, data_inicio, data_fim) VALUES (?, ?, ?, ?)";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
            
            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());    
            ps.setString(3, e.getDataInicio());
            ps.setString(4, e.getDataFim());
            
            ps.execute();
        //6. Fechar a conexão
            conexao.close();
         
               
    }
}