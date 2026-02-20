/* 7 - Classe Triângulo: Implemente uma classe Triangulo com atributos como base, altura e método para calcular a área. */

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}