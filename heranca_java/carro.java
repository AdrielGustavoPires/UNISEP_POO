package heranca_java;

public class carro extends veiculo {
    private int numeroPortas;

    public carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public void abrirPortamalas() {
        super.exibirInformacoes();
        System.out.println("O carro " + marca + " " + modelo + " está abrindo o porta-malas.");
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + numeroPortas);
    }
}
