package modules.three.exercises.buscas;

// 3 - Busca Linear:
// Escreva um método que realize uma busca linear em um array de inteiros para encontrar um número
// específico e retorne a posição do número ou -1 se não for encontrado.

public class BuscaLinear {
  public int buscaLinear(int[] array, int alvo) {
    // Percorre o array do início (índice 0) até o fim
    for (int i = 0; i < array.length; i++) {

      // Se o elemento atual for igual ao que buscamos
      if (array[i] == alvo) {
        return i; // Retorna a posição (índice) imediatamente
      }
    }

    // Se o laço terminar e não encontrar nada, retorna -1
    return -1;
  }

  public static void main(String[] args) {
    BuscaLinear buscador = new BuscaLinear();
    int[] meuArray = { 10, 50, 30, 70, 80, 60, 20, 90, 40 };

    int alvo = 100;
    int resultado = buscador.buscaLinear(meuArray, alvo);

    if (resultado != -1) {
      System.out.println("Achei o " + alvo + " na posição: " + resultado);
    } else {
      System.out.println("O número " + alvo + " não está no array.");
    }
  }
}
