package modules.two.exercises.maps;

import java.util.HashMap;
import java.util.Map;

// 8 - Contagem de Palavras:
// Escreva um programa que conte a frequência das palavras em uma frase utilizando um HashMap. 

public class ContagemDePalavras {
  public static void main(String[] args) {
    // frase pra ser mapeada
    String phrase = "Java é bom Java é legal eu gosto de Java";
    // Faço a separação das palavras
    String[] words = phrase.toLowerCase().split(" ");

    // inicializo meu array mapeado
    Map<String, Integer> counter = new HashMap<>(); 

    // busco uma palavra em palavras
    for (String word : words) {
      // verifico se minha palavra existe no meu array mapeado
      if(counter.containsKey(word)) {
        // se já existir eu incremento a quantidade de repetições
        int quantity = counter.get(word); // quantidade de repetições existente
        counter.put(word, quantity + 1);
      } else {
        // se não existir eu adiciono ao array mapeado (counter)
        counter.put(word, 1);
      }
    }

    // imprimo resultado na tela
    System.out.println(counter);
  }
}
