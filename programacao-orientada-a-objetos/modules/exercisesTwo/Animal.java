/* 2 - Desenvolva uma hierarquia de classes representando animais, começando com uma classe base Animal e subclasses como Mamifero, Ave e Peixe. */

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som genérico do animal.");
    }
}