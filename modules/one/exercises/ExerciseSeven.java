package exercises;

import java.util.Scanner;

// Exercício 7: Listas e Matrizes
// • Implemente um jogo da velha (Tic-Tac-Toe) usando uma matriz para representar o tabuleiro.
// Permita que dois jogadores façam jogadas alternadas.

public class ExerciseSeven {
  // Matriz 3x3 que representa o tabuleiro do jogo da velha
  // Cada posição começa vazia (espaço em branco)
  static char[][] tabuleiro = {
      { ' ', ' ', ' ' },
      { ' ', ' ', ' ' },
      { ' ', ' ', ' ' }
  };

  // Define qual jogador começa. O jogo sempre inicia com 'X'
  static char jogadorAtual = 'X';

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Controla se o jogo ainda está acontecendo
    boolean jogoAtivo = true;

    // Mantém ativo enquanto ninguém venceu ou empatou
    while (jogoAtivo) {
      imprimirTabuleiro();

      // Informa de quem é a vez
      System.out.println("Jogador " + jogadorAtual + ", informe a linha e a coluna (0, 1, 2):");

      System.out.print("Linha: ");
      int linha = scanner.nextInt();

      System.out.print("Coluna: ");
      int coluna = scanner.nextInt();

      // Verifica se a posição escolhida é válida e está vazia
      if (checarJogada(linha, coluna)) {
        // Marca o símbolo do jogador atual na posição escolhida
        tabuleiro[linha][coluna] = jogadorAtual;

        // Depois da jogada, verifica se houve vitória
        if (checarVitoria()) {
          imprimirTabuleiro();
          System.out.println("Jogador " + jogadorAtual + " venceu!");
          jogoAtivo = false;

        // Se não venceu, verifica se todas as posições foram preenchidas (empate)
        } else if (checarEmpate()) {
          imprimirTabuleiro();
          System.out.println("Houve um Empate!");
          jogoAtivo = false;

        // Caso contrário, apenas troca o jogador e continua o jogo
        } else {
          trocarJogador();
        }

      } else {
        // Caso a jogada seja inválida (fora dos limites ou já ocupada)
        System.out.println("Jogada inválida, selecione os índices dentro das opções");
      }
    }

    scanner.close();
  }

  public static void imprimirTabuleiro() {

    // Percorre cada linha da matriz e imprime no formato visual do jogo
    System.out.println(); // apenas espaço
    for (int i = 0; i < 3; i++) {
      System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
      // Adiciona separador entre as linhas, exceto após a última
      if (i < 2) {
        System.out.println("---+---+---");
      }
      // exemplo de como fica ao das iterações
      //    |   |    
      // ---+---+---
      //    |   |  
      // ---+---+---
      //   |   |  
    }
    System.out.println();// apenas espaço
  }

  public static boolean checarJogada(int linha, int coluna) {
    // Garante que os índices estejam entre 0 e 2
    // E que a posição escolhida ainda esteja vazia
    return linha >= 0 && linha < 3
        && coluna >= 0 && coluna < 3
        && tabuleiro[linha][coluna] == ' ';
  }

  public static void trocarJogador() {
    // Alterna entre X e O após cada jogada válida
    jogadorAtual = jogadorAtual == 'X' ? 'O' : 'X';
  }

  public static boolean checarVitoria() {

    // Verifica todas as linhas e colunas
    for (int i = 0; i < 3; i++) {

      // Linha completa com o mesmo símbolo
      if (tabuleiro[i][0] == jogadorAtual &&
          tabuleiro[i][1] == jogadorAtual &&
          tabuleiro[i][2] == jogadorAtual) {
        return true;
      }

      // Coluna completa com o mesmo símbolo
      if (tabuleiro[0][i] == jogadorAtual &&
          tabuleiro[1][i] == jogadorAtual &&
          tabuleiro[2][i] == jogadorAtual) {
        return true;
      }
    }

    // Verifica diagonal da esquerda para a direita
    if (tabuleiro[0][0] == jogadorAtual &&
        tabuleiro[1][1] == jogadorAtual &&
        tabuleiro[2][2] == jogadorAtual) {
      return true;
    }

    // Verifica diagonal da direita para a esquerda
    if (tabuleiro[0][2] == jogadorAtual &&
        tabuleiro[1][1] == jogadorAtual &&
        tabuleiro[2][0] == jogadorAtual) {
      return true;
    }

    return false;
  }

  public static boolean checarEmpate() {

    // Percorre todo o tabuleiro procurando espaços vazios
    // Se encontrar algum, ainda não é empate
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (tabuleiro[i][j] == ' ') {
          return false;
        }
      }
    }

    // Se nenhuma posição estiver vazia e ninguém venceu, é empate
    return true;
  }
}