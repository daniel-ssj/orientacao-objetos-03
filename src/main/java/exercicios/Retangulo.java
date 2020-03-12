package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public Retangulo (Double altura, Double base) {
        setAltura(altura);
        setBase(base);
    }

    public static Retangulo criarRetanguloComBaseEAltura(Double altura, Double base) {
        return new Retangulo(altura, base);
    }

    public Double calcularArea() {
        return base * altura;
    }

    public Double calcularPerimetro() {
        return 2* (base + altura);
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
