package exercicio_07;
import exercicio_06.*;

public class TesteFuncionario {
    public static void main(String[] args) {
        // variáveis
        double custosDaEmpresa, custosEnsinoBasico, custosEnsinoMedio, custosGraduacao;
        double rendaFuncionario;
        custosDaEmpresa = custosEnsinoBasico = custosEnsinoMedio = custosGraduacao = 0.0;

        // criar array com 10 funcionários
        Funcionario[] funcionarios = criarFuncionarios();

        // definir custos totais
        for (Funcionario funcionario : funcionarios) {
            rendaFuncionario = funcionario.rendaTotal();
            custosDaEmpresa += rendaFuncionario;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custosEnsinoBasico += rendaFuncionario;
            }
            else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custosEnsinoMedio += rendaFuncionario;
            }
            else {
                custosGraduacao += rendaFuncionario;
            }
        }

        // impressao de valores
        System.out.println("Custos totais da Empresa: " + custosDaEmpresa
                            + "\nCustos de funcionários com ensino básico: " + custosEnsinoBasico
                            + "\nCustos de funcionários com ensino médio: " + custosEnsinoMedio
                            + "\nCustos de funcionários com graduação: " + custosGraduacao);
    }

    // metodo criar funcionarios
    public static Funcionario[] criarFuncionarios() {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int index = 0; index < 10; index++) {
            if (index < 4) {
                funcionarios[index] = new FuncionarioEnsinoBasico("Func " + (index+1), index + "0" + (index+1), "Escola básica " + (index+1));
            }
            else if (index < 8) {
                funcionarios[index] = new FuncionarioEnsinoMedio("Func " + (index+1), (index+1) + "2" + index, "Escola básica " + (index+1), "Escola ensino médio "+ (index+1));
            }
            else {
                funcionarios[index] = new FuncionarioGraduacao("Func " + (index+1), (index+1) + "1" + (index+2), "Escola básica " + (index+1), "Escola ensino médio "+ (index+1), "Universidade "+ (index+1));
            }
        }
        return funcionarios;
    }
}
