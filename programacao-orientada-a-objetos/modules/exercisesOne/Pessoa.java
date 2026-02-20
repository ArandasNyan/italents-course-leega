/* 2 - Classe Pessoa: Desenvolva uma classe Pessoa que tenha atributos como nome, idade e método para cumprimentar. */

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}