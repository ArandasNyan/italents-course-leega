/* 10 - Crie uma interface Autenticavel com um método autenticar. Implemente essa interface nas classes Usuario e Administrador. Em seguida, crie uma lista de objetos que implementam Autenticavel e chame o método autenticar para cada um. */

public class Usuario implements Autenticavel {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}