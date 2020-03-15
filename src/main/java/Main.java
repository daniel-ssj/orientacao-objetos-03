import exemplos.*;
import exercicios.*;

public class Main {
    public static void main(String[] args) {
        //Correntista c1 = new Correntista(1, "Ronaldo");
        //System.out.println(c1.getNome());

        Correntista c2 = Correntista.criarComNomeEmailETelefone(1, "Maria", "maria@email.com", "+55 11 1234-5678");
        System.out.println(c2.getNome());
        System.out.println(c2.getEmail());
        System.out.println(c2.getTelefone());
    }
}
