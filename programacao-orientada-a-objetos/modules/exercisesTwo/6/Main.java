public class Main {

  public static void main(String[] args) {

      Calculadora calc = new Calculadora();

      System.out.println("Soma int: " + calc.soma(5, 3));
      System.out.println("Soma double: " + calc.soma(2.5, 4.5));
      System.out.println("Soma misto: " + calc.soma(10, 2.5));

      System.out.println("Subtração: " + calc.subtrair(10, 4));

      System.out.println("Multiplicação: " + calc.multiplicar(3, 7));

      System.out.println("Divisão int: " + calc.dividir(10, 2));
      System.out.println("Divisão double: " + calc.dividir(7.5, 2.5));
  }
}