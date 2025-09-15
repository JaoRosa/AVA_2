import java.util.InputMismatchException;
import java.util.Scanner;

public class Transporte {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    public Transporte() {}

    public Transporte(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public int getCapacidadeTanque() { return capacidadeTanque; }
    public void setCapacidadeTanque(int capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }

    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void entrada(Scanner sc) {
        try {
            System.out.print("Capacidade do tanque: ");
            capacidadeTanque = sc.nextInt();

            System.out.print("Número de passageiros: ");
            numeroPassageiros = sc.nextInt();

            System.out.print("Preço: ");
            preco = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Tente novamente.");
            sc.nextLine();
            entrada(sc);
        }
    }

    public void imprimir() {
        System.out.println("Capacidade do tanque: " + capacidadeTanque);
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Preço: R$" + preco);
    }
}
