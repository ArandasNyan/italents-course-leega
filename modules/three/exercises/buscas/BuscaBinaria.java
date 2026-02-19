package modules.three.exercises.buscas;

// 4 - Busca Binária:
// Implemente um algoritmo de busca binária para encontrar um elemento específico em um array
// ordenado de inteiros. Retorne a posição do número ou -1 se não for encontrado.

public class BuscaBinaria {
  public int buscaBinaria(int[] array, int alvo) {
    int inicio = 0;
    int fim = array.length - 1;

    while (inicio <= fim) {
      // Calculamos o meio do intervalo atual
      int meio = inicio + (fim - inicio) / 2;

      // Encontramos o alvo?
      if (array[meio] == alvo) {
        return meio;
      }

      // O alvo é maior que o valor do meio?
      // Então ignoramos a metade esquerda
      if (array[meio] < alvo) {
        inicio = meio + 1;
      }
      // O alvo é menor que o valor do meio?
      // Então ignoramos a metade direita
      else {
        fim = meio - 1;
      }
    }

    // Se o laço terminar, o elemento não existe
    return -1;
  }

  public static void main(String[] args) {
    BuscaBinaria buscador = new BuscaBinaria();
    // O array DEVE estar ordenado!
    int[] meuArrayOrdenado = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

    int alvo = 80;
    int resultado = buscador.buscaBinaria(meuArrayOrdenado, alvo);

    System.out.println(resultado != -1 ? "Índice: " + resultado : "Não encontrado");
  }
}
