public class Usuario implements Autenticavel {

  private String nome;
  private String senha;

  public Usuario(String nome, String senha) {
      this.nome = nome;
      this.senha = senha;
  }

  @Override
  public boolean autenticar(String senha) {
      if (this.senha.equals(senha)) {
          System.out.println("Usuário " + nome + " autenticado com sucesso.");
          return true;
      } else {
          System.out.println("Falha na autenticação do usuário " + nome);
          return false;
      }
  }
}