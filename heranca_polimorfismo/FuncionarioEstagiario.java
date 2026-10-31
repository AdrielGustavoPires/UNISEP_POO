package heranca_polimorfismo;

public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

   
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * 0.05);
    }
}