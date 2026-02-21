public class Carro extends Veiculo {
    private String cor;
    private int portas;

    public Carro(String modelo, int ano, String cor, int portas) {
        super(modelo, ano);
        this.cor = cor;
        this.portas = portas;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes(); // Chama o print de modelo e ano
        System.out.println(", Cor: " + cor + ", Portas: " + portas);
    }
}