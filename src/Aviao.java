import java.util.Scanner;

public class Aviao extends Transporte {
    private String prefixo;
    private String dataRevisao;

    public Aviao() {
        super();
    }

    public Aviao(String prefixo, String dataRevisao, int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() { return prefixo; }
    public void setPrefixo(String prefixo) { this.prefixo = prefixo; }

    public String getDataRevisao() { return dataRevisao; }
    public void setDataRevisao(String dataRevisao) { this.dataRevisao = dataRevisao; }

    public void reajustarPreco(double percentual) {
        preco += preco * (percentual / 100);
    }

    @Override
    public void entrada(Scanner sc) {
        sc.nextLine();
        System.out.print("Prefixo do avião: ");
        prefixo = sc.nextLine();

        super.entrada(sc);

        sc.nextLine();
        System.out.print("Data da revisão: ");
        dataRevisao = sc.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("=== Avião ===");
        System.out.println("Prefixo: " + prefixo);
        super.imprimir();
        System.out.println("Data da revisão: " + dataRevisao);
    }
}
