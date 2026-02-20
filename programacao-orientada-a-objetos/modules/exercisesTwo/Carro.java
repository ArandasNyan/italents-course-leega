/* 1 - Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo, cada um deve possuir pelo menos 2 atributos e um metodo a mais. */

public class Carro extends Veiculo {
    private String cor;
    private int portas;

    public Carro(String modelo, int ano, String cor, int portas) {
        super(modelo, ano);
        this.cor = cor;
        this.portas = portas;
    }

    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cor: " + cor + ", Portas: " + portas);
    }
}