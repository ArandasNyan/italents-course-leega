/* 6 - Classe Produto: Crie uma classe Produto com atributos como nome, preço e método para calcular o preço com desconto. */

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(double desconto) {
        return preco - desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}