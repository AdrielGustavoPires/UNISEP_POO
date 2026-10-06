package heranca_java;

public class veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

public veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O veículo " + marca + " " + modelo + " está acelerando.");
        
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}
