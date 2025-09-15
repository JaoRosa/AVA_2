import java.util.InputMismatchException;
import java.util.Scanner;

public class Navio extends Transporte {
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    public Navio() {
        super();
    }

    public Navio(String nome) {
        this.nome = nome;
    }

    public Navio(String nome, int numeroTripulantes) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento, int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getNumeroTripulantes() { return numeroTripulantes; }
    public void setNumeroTripulantes(int numeroTripulantes) { this.numeroTripulantes = numeroTripulantes; }

    public String getDataLancamento() { return dataLancamento; }
    public void setDataLancamento(String dataLancamento) { this.dataLancamento = dataLancamento; }

    public double passageirosPorTripulantes() {
        if (numeroTripulantes == 0) return 0;
        return (double) numeroPassageiros / numeroTripulantes;
    }

    @Override
    public void entrada(Scanner sc) {
        sc.nextLine();
        System.out.print("Nome do navio: ");
        nome = sc.nextLine();

        super.entrada(sc);

        try {
            System.out.print("Número de tripulantes: ");
            numeroTripulantes = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Número inválido. Tente novamente.");
            sc.nextLine();
            entrada(sc);
            return;
        }

        sc.nextLine();
        System.out.print("Data de lançamento: ");
        dataLancamento = sc.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("=== Navio ===");
        System.out.println("Nome: " + nome);
        super.imprimir();
        System.out.println("Número de tripulantes: " + numeroTripulantes);
        System.out.println("Data de lançamento: " + dataLancamento);
        System.out.printf("Passageiros por tripulante: %.2f%n", passageirosPorTripulantes());
    }
}
