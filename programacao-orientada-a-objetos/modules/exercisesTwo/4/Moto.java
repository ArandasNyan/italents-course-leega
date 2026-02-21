public class Moto extends Veiculo {
    private int cilindradas;
    private String tipo;

    public Moto(String modelo, int ano, int cilindradas, String tipo) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes(); // Chama o print de modelo e ano
        System.out.println(", Cilindradas: " + cilindradas + ", Tipo: " + tipo);
    }
}