package lessons;

public class DadosPessoa {
  private String nome;
  private int idade;
  private float peso;
  private float altura;

  public DadosPessoa(String nome, int idade, float peso, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public void exibirInformacoes() {
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("peso: " + peso);
    System.out.println("altura: " + altura);
  }
  /**
   * 
   * @param alturaTest float value
   * @return true or false
   */
  public boolean verificarAltura(float alturaTest) {
    if(alturaTest >= 1.70f) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    DadosPessoa pessoa = new DadosPessoa("Erick", 18, 74.5f, 1.68f);

    pessoa.exibirInformacoes();
    System.out.println(pessoa.verificarAltura(pessoa.altura));
  }
}
