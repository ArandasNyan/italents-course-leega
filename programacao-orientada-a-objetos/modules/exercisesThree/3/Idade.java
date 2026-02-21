import java.util.Scanner;

public class Idade {

  public void verificarIdade(int idade) {
    if (idade < 0 || idade > 150) {
      throw new IllegalArgumentException(
          "Idade inválida. Deve estar entre 0 e 150 anos.");
    }

    System.out.println("Idade válida: " + idade + " anos.");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Idade verificador = new Idade();

    System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();

    try {
      verificador.verificarIdade(idade);
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    scanner.close();
  }
}