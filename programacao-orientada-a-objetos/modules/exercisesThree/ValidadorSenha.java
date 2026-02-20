/* 8 - Implemente uma classe ValidadorSenha que contenha um método validarSenha(String senha) que lança uma exceção personalizada SenhaInvalidaException se a senha não atender aos critérios de segurança (por exemplo, se for muito curta). */

public class ValidadorSenha {
    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 6) {
            throw new SenhaInvalidaException("Senha muito curta.");
        }
    }
}