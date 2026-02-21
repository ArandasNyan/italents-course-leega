import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

    // Método responsável por ler o arquivo
    public static void lerArquivo(String caminho) {

        try (Scanner scanner = new Scanner(new File(caminho))) {

            System.out.println("Conteúdo do arquivo:\n");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado no caminho informado.");
            System.out.println("Detalhes técnicos: " + e.getMessage());
        }
    }

    // Método principal para execução do programa
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = entrada.nextLine();

        lerArquivo(caminho);

        entrada.close();
    }
}