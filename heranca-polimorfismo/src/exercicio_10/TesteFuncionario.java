package exercicio_10;
import exercicio_08.*;
import exercicio_09.*;

public class TesteFuncionario {
    public static void main(String[] args) {
        // variáveis
        double custosDaEmpresa, custosGerente, custosSupervisor, custosVendedor;
        double rendaFuncionario;
        custosDaEmpresa = custosGerente = custosSupervisor = custosVendedor = 0.0;

        // criar array com 10 funcionários
        Funcionario[] funcionarios = criarFuncionarios();

        // definir custos totais
        for (Funcionario funcionario : funcionarios) {
            rendaFuncionario = funcionario.rendaTotal();
            Comissoes comissao = funcionario.getComissao();

            custosDaEmpresa += rendaFuncionario;
            if (comissao instanceof Gerente) {
                custosGerente += rendaFuncionario;
            }
            else if (comissao instanceof Supervisor) {
                custosSupervisor += rendaFuncionario;
            }
            else {
                custosVendedor += rendaFuncionario;
            }
        }

        // impressao de valores
        System.out.println("Custos totais da Empresa: " + custosDaEmpresa
                            + "\nCustos de funcionários gerentes: " + custosGerente
                            + "\nCustos de funcionários supervisores: " + custosSupervisor
                            + "\nCustos de funcionários vendedores: " + custosVendedor);
    }

    // metodo criar funcionarios
    public static Funcionario[] criarFuncionarios() {
        Funcionario[] funcionarios = new Funcionario[10];

        int index = 0;
        for (Funcionario funcionario : funcionarios) {
            if (index < 1) {
                funcionarios[index] = new FuncionarioGraduacao("Func " + (index+1), (index+1) + "1" + (index+2), "Escola básica " + (index+1), "Escola ensino médio "+ (index+1), "Universidade "+ (index+1), new Gerente());
            }
            else if (index < 3) {
                funcionarios[index] = new FuncionarioEnsinoMedio("Func " + (index+1), (index+1) + "2" + index, "Escola básica " + (index+1), "Escola ensino médio "+ (index+1), new Supervisor());
            }
            else {
                funcionarios[index] = new FuncionarioEnsinoBasico("Func " + (index+1), index + "0" + (index+1), "Escola básica " + (index+1), new Vendedor());
            }
            index++;
        }
        return funcionarios;
    }
}
