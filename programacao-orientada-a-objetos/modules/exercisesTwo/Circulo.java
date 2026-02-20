/* 7 - Crie uma classe FormaGeometrica com métodos para calcular área e perímetro. Em seguida, crie subclasses como Circulo, Retangulo e triangulo que herdam de FormaGeometrica e implementam esses métodos. */

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}