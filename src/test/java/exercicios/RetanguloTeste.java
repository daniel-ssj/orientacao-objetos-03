package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {

    @Test
    public void construtorRetangulo() {
        Retangulo r = new Retangulo(35.7, 10.0);
        assertEquals(35.7, r.getAltura());
        assertEquals(10.0, r.getBase());
    }

    @Test
    public void metodoCriarRetanguloComBaseEAltura() {
        Retangulo r = Retangulo.criarRetanguloComBaseEAltura(35.7, 10.0);
        assertEquals(35.7, r.getAltura());
        assertEquals(10.0, r.getBase());
    }

    @Test
    public void criarObjetoRetangulo() {
        Retangulo r = new Retangulo(35.7, 10.0);
        assertNotNull(r);
    }

    @Test
    public void presencaAtributoBase() {
        Retangulo r = new Retangulo(35.7, 10.0);
        assertNotNull(r.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        Retangulo r = new Retangulo(35.7, 10.0);
        assertNotNull(r.getAltura());
    }

    @Test
    public void metodoCalcularArea() {
        Retangulo r = new Retangulo(10.0, 10.0);
        Double valorEsperado = 100.0;
        Double valorObtido = r.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Retangulo r = new Retangulo(10.0, 10.0);
        Double valorEsperado = 40.0;
        Double valorObtido = r.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoSetAltura() {
        Retangulo r = new Retangulo(8.1, 10.0);
        r.setAltura(8.1);
        assertEquals(r.getAltura(), 8.1);
    }

    @Test
    public void metodoGetAltura() {
        Retangulo r = new Retangulo(8.1, 10.0);
        assertEquals(r.getAltura(), 8.1);
    }

    @Test
    public void metodoSetBase() {
        Retangulo r = new Retangulo(10.0, 8.1);
        assertEquals(r.getBase(), 8.1);
    }

    @Test
    public void metodoGetBase() {
        Retangulo r = new Retangulo(10.0, 8.1);
        r.setBase(8.1);
        assertEquals(r.getBase(), 8.1);
    }

}
