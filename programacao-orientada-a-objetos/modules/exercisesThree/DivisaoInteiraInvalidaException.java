/* 10 - Crie uma classe DivisaoInteira com um método que execute uma divisão inteira entre dois números e lance uma exceção personalizada DivisaoInteiraInvalidaException se a divisão não for exata. */

public class DivisaoInteiraInvalidaException extends Exception {
    public DivisaoInteiraInvalidaException(String message) {
        super(message);
    }
}