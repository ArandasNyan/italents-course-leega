public class Moto extends Veiculo {
    private int cilindradas;
    private boolean possuiPartidaEletrica;

    public Moto(String modelo, int ano, int cilindradas, boolean partidaEletrica) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.possuiPartidaEletrica = partidaEletrica;
    }

    public void darGrau() {
        System.out.println("A moto de " + cilindradas + "cc está empinando!");
    }
}