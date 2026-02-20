/* 1 - Classe Círculo: Crie uma classe Circulo que represente um círculo com atributos como raio, área e métodos para calcular a área e o perímetro. */

public class Circulo {
    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
        this.area = calcularArea();
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }
}