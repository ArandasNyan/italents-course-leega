public class InsertionSort {
  public static void insertionSort(int[] arr) {
    int tamanho = arr.length;
    for (int i = 0; i < tamanho; i++) {
      int temp = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j+1] = temp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {4,3,2,1,6,5,7,9,8};

    for (int i : arr) {
      System.out.print(i + " ");
    }
    insertionSort(arr);
    
    System.out.println();
    System.out.println("Array ordenado: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
