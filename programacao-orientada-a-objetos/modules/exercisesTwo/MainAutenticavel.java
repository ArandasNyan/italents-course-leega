/* 10 - Crie uma interface Autenticavel com um método autenticar. Implemente essa interface nas classes Usuario e Administrador. Em seguida, crie uma lista de objetos que implementam Autenticavel e chame o método autenticar para cada um. */

import java.util.ArrayList;

public class MainAutenticavel {
    public static void main(String[] args) {
        ArrayList<Autenticavel> autenticaveis = new ArrayList<>();
        autenticaveis.add(new Usuario("João", "123"));
        autenticaveis.add(new Administrador("Admin", "admin"));

        for (Autenticavel a : autenticaveis) {
            System.out.println(a.autenticar("123"));
        }
    }
}