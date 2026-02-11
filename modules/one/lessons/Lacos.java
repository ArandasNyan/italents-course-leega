package lessons;

public class Lacos {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    };

    System.out.println("=================== CHANGE ===================");
    int x = 0;
    while (x < 10) {
      System.out.println(x);
      x++;
    }
    
    System.out.println("=================== CHANGE ===================");
    int y = 0;
    do {
      System.out.println(y);
      y++;
    } while (y < 10);
  }
}
