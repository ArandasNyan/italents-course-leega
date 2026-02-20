/* 2 - Desenvolva uma hierarquia de classes representando animais, começando com uma classe base Animal e subclasses como Mamifero, Ave e Peixe. */

public class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe emitindo som.");
    }
}