package lessons;

import java.util.Scanner;

public class Pessoa {
  // atributos
  private String nome;
  private int idade;
  private float peso;

  // construtor
  public Pessoa(String nome, int idade, float peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  // metodos
  public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("peso: " + peso);
  };

  public void aniversario() {
    this.idade += 1;
  };

  // Getters Setters
  public String getNome() {
    return this.nome;
  };

  public void setNome(String nome) {
    this.nome = nome;
  };

  public int getIdade(int idade) {
    return this.idade;
  }

  public void setName(int idade) {
    this.idade = idade;
  }

  public float getPeso(float peso) {
    return this.peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pessoa pessoa = new Pessoa( "Emmanoel Vieira", 22, 86.3f );

    pessoa.exibirInformacoes();
    pessoa.aniversario();
    pessoa.exibirInformacoes();
    pessoa.setNome("Laura Faustino");
    pessoa.exibirInformacoes();

    System.out.print("Digite o seu nome: ");
    String nome = scanner.nextLine();
    System.out.print("Digite a sua idade: ");
    int idade = Integer.parseInt(scanner.nextLine());
    System.out.print("Digite o seu peso: ");
    float peso = Float.parseFloat(scanner.nextLine());
    scanner.close();

    Pessoa pessoa2 = new Pessoa(nome, idade, peso);

    pessoa2.exibirInformacoes();
  }
}