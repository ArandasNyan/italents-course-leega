public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(modelo, ano); // Passa os dados para o construtor de Veiculo
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas do " + modelo + " aberto!");
    }
}