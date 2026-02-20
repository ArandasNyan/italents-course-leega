package modules.two.exercises.filas;

import java.util.LinkedList;
import java.util.Queue;

// 6 - Implementação de um Sistema de Fila de Espera:
// Crie um sistema simples de fila de espera com funcionalidades de adicionar, remover e exibir
// elementos.

public class FilaDeEspera {
    private Queue<String> clientes = new LinkedList<>();
    
    public static void main(String[] args) {
        FilaDeEspera filaPizzaria = new FilaDeEspera();

        filaPizzaria.adicionar("Emmanoel");
        filaPizzaria.adicionar("Maria");
        filaPizzaria.adicionar("João");

        filaPizzaria.exibirFila();

        filaPizzaria.remover(); // Remove o Emmanoel
        filaPizzaria.exibirFila();

        filaPizzaria.remover();
        filaPizzaria.remover();

        filaPizzaria.exibirFila();
        filaPizzaria.remover(); // Aviso de fila vazia
    }
    
    // Adicionar à fila
    public void adicionar(String nome) {
        clientes.add(nome);
        System.out.println("✅ " + nome + " entrou na fila.");
    }

    // Remover da fila
    public void remover() {
        // poll() retorna null se a fila estiver vazia, facilitando o controle
        String clienteAtendido = clientes.poll();
        
        if (clienteAtendido == null) {
            System.out.println("⚠️ Erro: A fila está vazia. Ninguém para remover.");
        } else {
            System.out.println("👤 " + clienteAtendido + " foi atendido e saiu da fila.");
        }
    }

    // Exibir resultado
    public void exibirFila() {
        System.out.println("\n--- STATUS ATUAL DA FILA ---");
        if (clientes.isEmpty()) {
            System.out.println("A fila está vazia no momento.");
        } else {
            int i = 1;
            // listagem de todos os clientes ainda não atendidos 1 a 1 
            for (String cliente : clientes) {
                System.out.println(i + "º - " + cliente);
                i++;
            }
        }
        System.out.println("----------------------------\n");
    }
}