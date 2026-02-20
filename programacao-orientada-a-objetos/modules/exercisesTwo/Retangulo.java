/* 7 - Crie uma classe FormaGeometrica com métodos para calcular área e perímetro. Em seguida, crie subclasses como Circulo, Retangulo e triangulo que herdam de FormaGeometrica e implementam esses métodos. */

public class Retangulo extends FormaGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}