import exemplos.Conta;
import exemplos.Quadrado;
import exercicios.Circulo;
import exercicios.Retangulo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1);
        Conta c2 = new Conta(2, 2000.00);
        Conta c3 = new Conta(3, 2000.00, 3000.00);

        Conta c4 = Conta.criarComLimite(4, 1500.00);
        Conta c5 = Conta.criarComLimiteESaldo(5, 1500.00, 5000.00);

        Retangulo r1 = Retangulo.criarRetanguloComBaseEAltura(35.7, 10.0);
        Retangulo r2 = new Retangulo(35.7, 10.0);

        Circulo circulo = new Circulo(10.00);

        Circulo circulo2 = Circulo.criarCirculoComRaio(50.78);

        System.out.println(circulo2.calcularPerimetro());

        System.out.println(circulo.calcularArea());

        //Quadrado q1 = new Quadrado(20.0);
        //System.out.println(q1.calcularArea());
        //System.out.println(q1.calcularPerimetro());
    }
}
