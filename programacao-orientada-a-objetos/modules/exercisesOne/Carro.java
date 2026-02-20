/* 9 - Classe Carro: Crie uma classe Carro com atributos como marca, modelo, ano e métodos para ligar, desligar e acelerar. */

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        System.out.println("Carro desligado.");
    }

    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}