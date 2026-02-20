/* 8 - Utilize a hierarquia de classes de animais do exercício 2 para criar uma lista de animais. Em seguida, percorra a lista chamando o método emitirSom de cada animal. */

import java.util.ArrayList;

public class MainAnimais {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Mamifero("Leão"));
        animais.add(new Ave("Pássaro"));
        animais.add(new Peixe("Peixe"));

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}