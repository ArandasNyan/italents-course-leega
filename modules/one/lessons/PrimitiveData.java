package lessons;
public class PrimitiveData {
  public static void main(String[] args) {
    byte byteValue = 127; // aceitável de 127 a -128
    short shortValue = 32767; // aceitável de 32.767 a -32.768
    int intValue = -2147483647; // aceitável de 2.147.483.647 a -2.147.483.648
    long longValue = -9223372036854775808L; // aceitável de 9.223.372.036.854.775.807 a -9.223.372.036.854.775.808, veja que ao final possui L para identificar o Long

    float floatValue = 3.14f; // note que o valor flutuante possui f ao final para identificação do float
    double doubleValue = 3.14234234; // permite um uso maior do ponto flutuante

    char character = 'A';

    boolean truth = true;
    final boolean falso = false;

    System.out.print(falso);
  };
};
