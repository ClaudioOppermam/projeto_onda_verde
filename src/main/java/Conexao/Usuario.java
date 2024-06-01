package Conexao;

/**
 *
 
@author Junior*/
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    //cadastro
    private String nome;
    private String email;
    private String cpf;
    private String idade;
    private Object sexo;

    public Usuario(){

    }

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(String login, String senha, int tipo){
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    public Usuario(String login, String senha, String nome, String cpf, String email, String idade){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
    
    public Usuario(String login, String senha, String nome, String cpf, String email, String idade, Object sexo){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return idade;
    }

    public Object getSexo() {
        return sexo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}