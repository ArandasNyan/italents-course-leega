package lessons;

public class Objetos {
  // atributos
  private String nome;
  private int idade;
  private float peso;

  // construtor
  public Objetos(String nome, int idade, float peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  // metodos
  public void exibirInformacoes() {
    Objetos pessoa = new Objetos( "Emmanoel Vieira", 22, 86.3f );
    System.out.println(pessoa.nome);
    System.out.println(pessoa.idade);
    System.out.println(pessoa.peso);
  }

  public static void main(String[] args) {
    Objetos pessoa = new Objetos( "Emmanoel Vieira", 22, 86.3f );

    pessoa.exibirInformacoes();
  }
}
