public class Calculadora {

    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        double resultado = dividir(10, 2);
        System.out.println("Resultado: " + resultado);

        // Teste com zero
        double erro = dividir(10, 0);
        System.out.println("Resultado: " + erro);
    }
}

class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}