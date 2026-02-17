package modules.three.lessons.buscas;

public class BuscaBinaria {
  static int buscaBinaria(int[] array, int element) {
    int inicio = 0;
    int fim = array.length -1;

    while(inicio <= fim) {
      int meio = inicio + (fim - inicio) / 2; // 0 + (10 - 0) / 2 ou  4 + (10 - 4) / 2 e assim por diante

      if (array[meio] == element) return meio;

      if (array[meio] < element) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }

    return -1;
  }
  
  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // o array deve estar ordenado para fazer a busca binária
    int element = 50;

    int resultado = buscaBinaria(array, element);

    if(resultado != -1) {
      System.out.println("Elemento encontrando na posição: " + resultado);
    } else {
      System.out.println("Elemento não encontrado!");
    }
  }
}
