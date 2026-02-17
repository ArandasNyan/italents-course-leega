package modules.three.lessons.buscas;

public class BuscaLinear {
  public static void main(String[] args) {
    int[] listaDeNumeros = {1,23,45,67,32,16,14,19,26,27,38};
    int elementoBuscado = 20;

    int resultado = buscaLinear(listaDeNumeros, elementoBuscado);
    if (resultado != -1) {
      System.out.println("Número encontrado na posição " + resultado + " do array.");
    } else {
      System.out.println("Número não encontrado!");
    }
  }

  static int buscaLinear(int[] array, int elemento) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == elemento) {
        return i;
      }
    }
    return -1; // não encontrado
  }

}
