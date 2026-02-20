/* 3 - Implemente uma classe Idade que tenha um método verificarIdade(int idade) que lança uma exceção se a idade for menor que 0 ou maior que 150. */

public class Idade {
    public static void verificarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }
}