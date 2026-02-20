/* 5 - Crie um método que leia um arquivo em Java e capture a exceção FileNotFoundException caso o arquivo não seja encontrado. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {
    public static void lerArquivo(String nomeArquivo) {
        try {
            File file = new File(nomeArquivo);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}