public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {1,3,2,4,6,5,8,9,7};

    System.out.println("Array não ordenado: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    selectionSort(arr);
    
    System.out.println();
    System.out.println("Array ordenado: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void selectionSort(int[] arr) {
    int tamanhoArray = arr.length;
    
    for (int i = 0; i < tamanhoArray; i++) {
      int minIndex = i;

      for (int j = i + 1; j < tamanhoArray; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
