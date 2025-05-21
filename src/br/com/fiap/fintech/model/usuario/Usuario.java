package br.com.fiap.fintech.model.usuario;

public class Usuario extends CadastroUsuario {

    private int idade;

    public Usuario(int idade) {
        this.idade = idade;
    }
    public Usuario(String nome, String email, int idade) {
        super(nome, email);
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
