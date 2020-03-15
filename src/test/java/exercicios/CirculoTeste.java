package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void construtorCirculo() {
        Circulo c = new Circulo(0.892);
        assertEquals(0.892, c.getRaio());
    }

    @Test
    public void metodoCriarCirculoComRaio() {
        Circulo c = Circulo.criarCirculoComRaio(0.892);
        assertEquals(0.892, c.getRaio());
    }

    @Test
    public void criarObjetoCirculo() {
        Circulo c = new Circulo();
        assertNotNull(c);
    }

    @Test
    public void presencaAtributoRaio() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        assertNotNull(c.getRaio());
    }

    @Test
    public void metodoCalcularArea() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        Double valorEsperado = 314.0;
        Double valorObtido = c.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        Double valorEsperado = 62.800000000000004;
        Double valorObtido = c.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoSetRaio() {
        Circulo c = new Circulo();
        c.setRaio(8.1);
        assertEquals(c.getRaio(), 8.1);
    }

    @Test
    public void metodoGetRaio() {
        Circulo c = new Circulo();
        c.setRaio(8.1);
        assertEquals(c.getRaio(), 8.1);
    }
}
