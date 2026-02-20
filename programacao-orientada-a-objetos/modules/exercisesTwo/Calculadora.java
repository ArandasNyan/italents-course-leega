/* 6 - Crie um exemplo de polimorfismo por sobrecarga, criando uma classe Calculadora que tenha métodos para as 4 operações básicas (soma, subtração, multiplicação, divisão) aceitando diferentes tipos de parâmetros. */

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        if (b != 0) return a / b;
        return 0;
    }

    public double divisao(double a, double b) {
        if (b != 0) return a / b;
        return 0;
    }
}