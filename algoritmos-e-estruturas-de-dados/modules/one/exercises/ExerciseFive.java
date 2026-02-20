package exercises;

// Exercício 5: Matrizes (Arrays)
// • Crie uma matriz (array) de números inteiros. Encontre e imprima o maior valor na matriz. 

public class ExerciseFive {
  public static void main(String[] args) {
    // Declaração da lista
    int[] arrayIntegers = { 5, 10, 2, 9, 11, 7, 3 };
    // Informo o primeiro número grande, sendo o primeiro item da lista
    int isBigger = arrayIntegers[0];

    // itero de 0 até o tamanho máximo do array
    for (int i = 0; i < arrayIntegers.length;  i++) {
      // se a posição atual do array é maior que o meu maior numero atual
      if (arrayIntegers[i] >= isBigger) {
        // então eu adiciono o número a variavel de maior número atual
        isBigger = arrayIntegers[i];
      }
    }

    System.out.println(isBigger);
  }
}
