package exercicios;

public class Circulo {
    private Double raio;

    public  Circulo() {

    }

    public Circulo(Double raio) {
        setRaio(raio);
    }

    public static Circulo criarCirculoComRaio(double raio) {
        return new Circulo(raio);
    }

    public Double calcularArea(){
        return 3.14 * (raio*raio);
    }

    public Double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
}
