package model;

public class Usuario {
    private String nome;
    private String senha;
    private String dataDeNascimento;
    private String email;

    public void cadastrar(){

    }

    public Usuario(String nomeUsuario, String senha) {
        this.nome = nomeUsuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
