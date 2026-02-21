import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Autenticavel> lista = new ArrayList<>();

        lista.add(new Usuario("João", "1234"));
        lista.add(new Administrador("Maria", "admin", 1));

        for (Autenticavel obj : lista) {
            obj.autenticar("1234"); // Testando autenticação
        }
    }
}