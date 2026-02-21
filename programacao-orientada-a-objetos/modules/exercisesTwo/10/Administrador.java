public class Administrador implements Autenticavel {

  private String nome;
  private String senha;
  private int nivelAcesso;

  public Administrador(String nome, String senha, int nivelAcesso) {
      this.nome = nome;
      this.senha = senha;
      this.nivelAcesso = nivelAcesso;
  }

  @Override
  public boolean autenticar(String senha) {
      if (this.senha.equals(senha) && nivelAcesso > 0) {
          System.out.println("Administrador " + nome + " autenticado com sucesso.");
          return true;
      } else {
          System.out.println("Falha na autenticação do administrador " + nome);
          return false;
      }
  }
}