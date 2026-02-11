package lessons;

public class Condicionais {
  // == comparação iguais
  // != diferente
  // < menor que
  // <= menor ou igual a
  // > maior que
  // >= maior ou igual a

  // && AND
  // || Pipes ou OR
  // ! não

  public static void main(String[] args) {
    int x;
    for (x = 0; x <= 10; x++) {
      if (x == 10) { // condicional If e Else
        System.err.println("X é igual a 10!");
      } else {
        System.out.println("X ainda não é 10!");
      }
    }

    // switch case
    int option = 1;
    switch (option) {
      case 1:
        System.out.println("Opção 1");
        break;
      case 2:
        System.out.println("Opção 2");
        break;
      case 3:
        System.out.println("Opção 3");
        break;
      default:
        break;
    }
  }
}
