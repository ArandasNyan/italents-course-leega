/* 10 - Crie uma interface Autenticavel com um método autenticar. Implemente essa interface nas classes Usuario e Administrador. Em seguida, crie uma lista de objetos que implementam Autenticavel e chame o método autenticar para cada um. */

public interface Autenticavel {
    boolean autenticar(String senha);
}