/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template meu 
 */
package Conexao;

/**
 *
 * @author Junior
 */
public class UsuarioDAO {
    
    boolean existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM login WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.login);
        ps.setString(2, u.senha);
        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        
        rs.close();
        conexao.close();
        ps.close();
        
        return usuarioExiste;
    }
}