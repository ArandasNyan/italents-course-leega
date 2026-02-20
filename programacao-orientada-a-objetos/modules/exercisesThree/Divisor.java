/* 1 - Escreva um método em Java que receba dois números como parâmetros e lance uma exceção se o segundo número for zero. */

public class Divisor {
    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}