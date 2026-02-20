/* 10 - Classe Funcionário: Implemente uma classe Funcionario com características como nome, cargo, salário e método para calcular aumento de salário. */

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularAumento(double percentual) {
        return salario + (salario * percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}