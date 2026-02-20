/* 10 - Crie uma classe DivisaoInteira com um método que execute uma divisão inteira entre dois números e lance uma exceção personalizada DivisaoInteiraInvalidaException se a divisão não for exata. */

public class DivisaoInteira {
    public static int dividir(int a, int b) throws DivisaoInteiraInvalidaException {
        if (a % b != 0) {
            throw new DivisaoInteiraInvalidaException("Divisão não é exata.");
        }
        return a / b;
    }
}