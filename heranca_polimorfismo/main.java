package heranca_polimorfismo;

public class main {
    public static void main(String[] args) {
        Funcionario clt = new FuncionarioCLT("Ana", 3000.00);
        Funcionario pj = new FuncionarioPJ("Bruno", 4000.00);
        Funcionario estagiario = new FuncionarioEstagiario("Carla", 1500.00);

        Funcionario[] funcionarios = { clt, pj, estagiario };

        for (Funcionario f : funcionarios) {
            double salarioFinal = f.calcularSalario();
            System.out.println("Nome: " + f.getNome());
            System.out.printf("Salário-base: R$ %.2f%n", f.getSalarioBase());
            System.out.printf("Salário final: R$ %.2f%n", salarioFinal);
            System.out.println("----------------------");
        }
    }
}