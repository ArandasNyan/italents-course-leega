import java.util.Scanner;

public class ConversorTemperatura {

  public double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
    if (temperaturaCelsius < -273.15) {
      throw new IllegalArgumentException(
          "Temperatura inválida: abaixo do zero absoluto (-273.15°C).");
    }

    return (temperaturaCelsius * 9 / 5) + 32;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ConversorTemperatura conversor = new ConversorTemperatura();

    System.out.print("Digite a temperatura em Celsius: ");
    double temperatura = scanner.nextDouble();

    try {
      double fahrenheit = conversor.converterCelsiusParaFahrenheit(temperatura);
      System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    scanner.close();
  }
}