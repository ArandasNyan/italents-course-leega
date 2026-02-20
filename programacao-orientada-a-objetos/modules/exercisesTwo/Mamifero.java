/* 2 - Desenvolva uma hierarquia de classes representando animais, começando com uma classe base Animal e subclasses como Mamifero, Ave e Peixe. */

public class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamífero emitindo som.");
    }
}