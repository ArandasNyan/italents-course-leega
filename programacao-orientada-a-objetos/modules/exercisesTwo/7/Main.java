public class Main {
  public static void main(String[] args) {

      FormaGeometrica circulo = new Circulo(5);
      FormaGeometrica retangulo = new Retangulo(4, 6);
      FormaGeometrica triangulo = new Triangulo(3, 4, 5);

      System.out.println("=== Círculo ===");
      System.out.println("Área: " + circulo.calcularArea());
      System.out.println("Perímetro: " + circulo.calcularPerimetro());

      System.out.println("\n=== Retângulo ===");
      System.out.println("Área: " + retangulo.calcularArea());
      System.out.println("Perímetro: " + retangulo.calcularPerimetro());

      System.out.println("\n=== Triângulo ===");
      System.out.println("Área: " + triangulo.calcularArea());
      System.out.println("Perímetro: " + triangulo.calcularPerimetro());
  }
}