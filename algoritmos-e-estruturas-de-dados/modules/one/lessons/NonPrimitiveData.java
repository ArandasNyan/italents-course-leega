package lessons;
public class NonPrimitiveData {
  public static void main(String[] args) {
    final String mySecondNameIs = "Vieira"; // Final define que a variavel será imutável como const de javascript

    String meuNome = "Emmanoel";

    enum diaDaSemana {
      DOMINGO,
      SEGUNDA,
      TERCA,
      QUARTA,
      QUINTA,
      SEXTA,
      SABADO
    }

    diaDaSemana dia = diaDaSemana.SEGUNDA;

    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };

    System.out.println(dia.toString().toLowerCase());
    System.out.println(numeros[0]);
  }
}
