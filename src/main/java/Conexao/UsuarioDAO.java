package Conexao;

/**
 *
 
@author Junior*/
public class UsuarioDAO {

    public boolean existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM tb_usuarios login WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        if(usuarioExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u = null;
        }

        rs.close();
        conexao.close();
        ps.close();

        return usuarioExiste;
    }
    public void cadastrar(Usuario u)  throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO tb_usuarios (login, senha, nome, email, cpf, idade, sexo) VALUES(?, ?, ?, ?, ?, ?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        ps.setString(3, u.getNome());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getCpf());
        ps.setString(6, u.getIdade());
        ps.setObject(7, u.getSexo());
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }     
}