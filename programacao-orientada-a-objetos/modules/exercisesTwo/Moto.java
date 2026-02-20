/* 1 - Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo, cada um deve possuir pelo menos 2 atributos e um metodo a mais. */

public class Moto extends Veiculo {
    private int cilindradas;
    private String tipo;

    public Moto(String modelo, int ano, int cilindradas, String tipo) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }

    public void buzinar() {
        System.out.println("Moto buzinando.");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + ", Tipo: " + tipo);
    }
}