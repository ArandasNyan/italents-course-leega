package exercises;

// Exercício 1: Variáveis Primitivas
// • Crie um programa que declare variáveis para armazenar um número inteiro, um número de
//   ponto flutuante e uma string. Atribua valores a essas variáveis e exiba-as na tela. 

public class ExerciseOne {
  public static void main(String[] args) {
    int integerNumber;
    float floatNumber;
    String meuNome;

    integerNumber = 10;
    floatNumber = 2.2f;
    meuNome = "Emmanoel Vieira";

    System.out.println("Número inteiro: " + integerNumber);
    System.out.println("Número de ponto flutuante: " + floatNumber);
    System.out.println("O meu nome é " + meuNome);
  }
}
