package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    @Test
    public void construtorCorrentista() {
        Correntista correntista1 = new Correntista(1, "Ronaldo");
        assertEquals(correntista1.getCodigo(), 1);
        assertEquals(correntista1.getNome(), "Ronaldo");
    }

    @Test
    public void metodoCriarComNome() {
        Correntista correntista1 = Correntista.criarComNome(1, "Maria");
        assertEquals(correntista1.getCodigo(), 1);
        assertEquals(correntista1.getNome(), "Maria");
    }

    @Test
    public void metodoCriarComNomeEEmail() {
        Correntista correntista1 = Correntista.criarComNomeEEmail(1, "Maria", "maria@email.com");
        assertEquals(correntista1.getCodigo(), 1);
        assertEquals(correntista1.getNome(), "Maria");
        assertEquals(correntista1.getEmail(), "maria@email.com");
    }

    @Test
    public void metodoCriarComNomeEmailETelefone() {
        Correntista correntista1 = Correntista.criarComNomeEmailETelefone(1, "Maria", "maria@email.com", "+55 11 1234-5678");
        assertEquals(correntista1.getCodigo(), 1);
        assertEquals(correntista1.getNome(), "Maria");
        assertEquals(correntista1.getEmail(), "maria@email.com");
        assertEquals(correntista1.getTelefone(), "+55 11 1234-5678");
    }

    @Test
    public void criarObjetoCorrentista() {
        Correntista correntista1 = new Correntista();
        assertNotNull(correntista1);
    }

    @Test
    public void presencaAtributos() {
        Correntista correntista1 = new Correntista();
        correntista1.setCodigo(1);
        correntista1.setEmail("correntista@email.com");
        correntista1.setNome("Correntista");
        correntista1.setTelefone("(12) 34567-8912");

        assertNotNull(correntista1.getCodigo());
        assertNotNull(correntista1.getEmail());
        assertNotNull(correntista1.getNome());
        assertNotNull(correntista1.getTelefone());
    }

}
