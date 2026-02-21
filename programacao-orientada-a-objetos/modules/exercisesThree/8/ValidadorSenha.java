public class ValidadorSenha {

  public void validarSenha(String senha) throws SenhaInvalidaException {

      if (senha == null || senha.length() < 8) {
          throw new SenhaInvalidaException(
              "A senha deve ter pelo menos 8 caracteres."
          );
      }

      if (!senha.matches(".*[A-Za-z].*")) {
          throw new SenhaInvalidaException(
              "A senha deve conter pelo menos uma letra."
          );
      }

      if (!senha.matches(".*\\d.*")) {
          throw new SenhaInvalidaException(
              "A senha deve conter pelo menos um número."
          );
      }

      System.out.println("Senha válida.");
  }
}