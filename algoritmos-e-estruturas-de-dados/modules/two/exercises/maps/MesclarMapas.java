package modules.two.exercises.maps;

import java.util.HashMap;
import java.util.Map;

// 9 - Mesclar Mapas:
// Implemente um método para mesclar dois HashMaps e manipular possíveis conflitos de chaves.

public class MesclarMapas {

    public static void main(String[] args) {
        // Estoque da Loja A
        Map<String, Integer> estoqueLojaA = new HashMap<>();
        estoqueLojaA.put("Teclado", 10);
        estoqueLojaA.put("Mouse", 20);
        estoqueLojaA.put("Monitor", 5);

        // Estoque da Loja B
        Map<String, Integer> estoqueLojaB = new HashMap<>();
        estoqueLojaB.put("Mouse", 15); // Forçamos um conflito, pois o item já existe na Loja A
        estoqueLojaB.put("Monitor", 2); // Conflito! Já existe na Loja A
        estoqueLojaB.put("Headset", 12); // Não há conflitos

        System.out.println("Estoque A: " + estoqueLojaA);
        System.out.println("Estoque B: " + estoqueLojaB);

        // Mesclando os mapas
        mesclarEstoques(estoqueLojaA, estoqueLojaB);

        System.out.println("\nEstoque Total (Após Mesclagem): " + estoqueLojaA);
    }

    public static void mesclarEstoques(Map<String, Integer> mapaPrincipal, Map<String, Integer> mapaSecundario) {

        // Pegamos cada "entrada" (par de chave e valor) do mapa secundário
        for (Map.Entry<String, Integer> entrada : mapaSecundario.entrySet()) {
            String produto = entrada.getKey();
            Integer quantidadeNova = entrada.getValue();

            // Verificamos se esse produto já existe no mapa principal
            if (mapaPrincipal.containsKey(produto)) {
                // Se já existe, pegamos o valor antigo e somamos com o novo
                Integer quantidadeAntiga = mapaPrincipal.get(produto);
                int total = quantidadeAntiga + quantidadeNova;

                System.out.println(
                        "⚠️ Conflito em [" + produto + "]: Somando " + quantidadeAntiga + " + " + quantidadeNova);

                // Atualizamos o mapa principal com o novo total
                mapaPrincipal.put(produto, total);
            } else {
                // Se não existe, apenas adicionamos o produto novo
                mapaPrincipal.put(produto, quantidadeNova);
            }
        }
    }
}