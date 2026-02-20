/* 5 - Classe Animal: Desenvolva uma classe Animal com características como nome, tipo de alimentação e método para emitir som. */

public class Animal {
    private String nome;
    private String tipoAlimentacao;

    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void emitirSom() {
        System.out.println("O animal " + nome + " emite um som.");
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }
}