/* 7 - Crie uma classe FormaGeometrica com métodos para calcular área e perímetro. Em seguida, crie subclasses como Circulo, Retangulo e triangulo que herdam de FormaGeometrica e implementam esses métodos. */

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Assumindo triângulo equilátero para simplicidade
        return 3 * base;
    }
}