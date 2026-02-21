import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando lista de animais
        List<Animal> listaAnimais = new ArrayList<>();

        // Adicionando diferentes tipos de animais
        listaAnimais.add(new Mamifero("Cachorro", 5));
        listaAnimais.add(new Ave("Papagaio", 2));
        listaAnimais.add(new Peixe("Palhaço", 1));
        listaAnimais.add(new Mamifero("Gato", 3));

        // Percorrendo a lista
        System.out.println("=== Sons dos Animais ===");

        for (Animal animal : listaAnimais) {
            System.out.println("Nome: " + animal.nome + ", Idade: " + animal.idade);
            animal.emitirSom(); // Polimorfismo acontece aqui
            System.out.println();
        }
    }
}