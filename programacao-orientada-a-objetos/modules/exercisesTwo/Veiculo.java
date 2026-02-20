/* 1 - Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo, cada um deve possuir pelo menos 2 atributos e um metodo a mais. */

public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}