public class Aplicacao {
    public static void main(String[] args) {
        Transporte[] vetor = new Transporte[20]; // 10 aviões + 10 navios
        int index = 0;

        // Preenchendo 10 aviões automaticamente
        for (int i = 0; i < 10; i++) {
            String prefixo = "PT-" + (char) ('A' + i) + (char) ('Z' - i);
            String dataRevisao = String.format("%02d/%02d/2025", (i + 1), (i % 12) + 1);
            int capacidadeTanque = 4500 + (i * 100);
            int numeroPassageiros = 150 + (i * 5);
            double preco = 90000000 + (i * 1000000);

            vetor[index++] = new Aviao(prefixo, dataRevisao, capacidadeTanque, numeroPassageiros, preco);
        }

        // Preenchendo 10 navios automaticamente
        for (int i = 0; i < 10; i++) {
            String nome = "Navio" + (i + 1);
            int numeroTripulantes = 45 + (i % 10);
            String dataLancamento = String.format("%02d/%02d/2025", (i + 10), (i % 12) + 1);
            int capacidadeTanque = 8000 + (i * 100);
            int numeroPassageiros = 280 + (i * 10);
            double preco = 75000000 + (i * 1500000);

            vetor[index++] = new Navio(nome, numeroTripulantes, dataLancamento, capacidadeTanque, numeroPassageiros, preco);
        }

        // Imprimindo todos os dados
        System.out.println("\n=== Dados Cadastrados ===");
        for (Transporte t : vetor) {
            if (t != null) {
                t.imprimir();
                System.out.println("------------------------");
            }
        }
    }
}
