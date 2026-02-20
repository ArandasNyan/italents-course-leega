package modules.two.exercises.listas;

import java.util.ArrayList;

// 2 - Remoção de Elementos Duplicados:
// Crie um método para remover elementos duplicados de um ArrayList

public class RemocaoDeDuplicatas {
  public static void main(String[] args) {
    // declaro uma variavel como arraylist do tipo string
    ArrayList<String> listaDeFrutas = new ArrayList<>();
    
    listaDeFrutas.add("Maçã");
    listaDeFrutas.add("Banana");
    listaDeFrutas.add("Uva");
    listaDeFrutas.add("Morango");
    listaDeFrutas.add("Kiwi");
    listaDeFrutas.add("Maçã");
    listaDeFrutas.add("Pêra");
    listaDeFrutas.add("Morango");
    listaDeFrutas.add("Abacaxi");
    listaDeFrutas.add("Mamão");
    
    // imprimo o tamnho do array com duplicatas e os itens dentro
    System.out.println("Sem remover duplicatas o array possui " + listaDeFrutas.size() + " frutas");
    System.out.println(listaDeFrutas);
    
    // utilizo o metodo filtra para remover as duplicatas
    ArrayList<String> listaAtualizada = filtro(listaDeFrutas);
    // imprimo novamente o tamanho do array sem duplicatas e itens dentro
    System.out.println("Removendo duplicatas o array possui " + listaAtualizada.size() + " frutas");
    System.out.println(listaAtualizada);
    
  }
  
  /**
   * 
   * @param lista
   * @return ArrayList<String>
   */
  public static ArrayList<String> filtro(ArrayList<String> lista) {
    ArrayList<String> listaDeFrutasFiltrada = new ArrayList<>();

    for (String fruta : lista) {
      // verifica se o item existe na lista filtrada, se não, ele adiciona!
      if(!listaDeFrutasFiltrada.contains(fruta)) {
        listaDeFrutasFiltrada.add(fruta);
      }
    }

    return listaDeFrutasFiltrada;
  }
}
