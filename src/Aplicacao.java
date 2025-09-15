import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transporte[] vetor = new Transporte[20];

        System.out.println("=== Cadastro de Aviões ===");
        for (int i = 0; i < 3; i++) {
            vetor[i] = new Aviao();
            System.out.println("Avião " + (i + 1));
            vetor[i].entrada(sc);
        }

        System.out.println("\n=== Cadastro de Navios ===");
        for (int i = 3; i < 6; i++) {
            vetor[i] = new Navio();
            System.out.println("Navio " + (i - 9));
            vetor[i].entrada(sc);
        }

        System.out.println("\n=== Dados Cadastrados ===");
        for (Transporte t : vetor) {
            t.imprimir();
            System.out.println("------------------------");
        }

        sc.close();
    }
}
