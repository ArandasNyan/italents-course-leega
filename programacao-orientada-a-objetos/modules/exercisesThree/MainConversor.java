/* 2 - Crie uma classe ConversorTemperatura com um método converterCelsiusParaFahrenheit(double temperaturaCelsius). Este método deve lançar uma exceção do tipo IllegalArgumentException se a temperatura Celsius fornecida for menor que -273.15, que é o zero absoluto em Celsius. Implemente um programa que utilize esta classe para converter uma temperatura Celsius em Fahrenheit e capture a exceção, caso ocorra, fornecendo uma mensagem de erro adequada. */

public class MainConversor {
    public static void main(String[] args) {
        try {
            double fahrenheit = ConversorTemperatura.converterCelsiusParaFahrenheit(-300);
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}