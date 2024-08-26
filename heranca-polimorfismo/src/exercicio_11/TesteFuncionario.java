package exercicio_11;

public class TesteFuncionario {
    public static void main(String[] args) {

        // criar array com 10 funcionários
        Funcionario[] funcionarios = criarFuncionarios();

        int index = 1;
        for (Funcionario funcionario : funcionarios) {
            System.out.println("\n---------FUNCIONARIO " + index + "---------\n");
            System.out.println(funcionario);
            index++;
        }
    }

    // metodo criar funcionarios
    public static Funcionario[] criarFuncionarios() {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int index = 0; index < 10; index++) {
            if (index < 4) {
                funcionarios[index] = new FuncionarioEnsinoBasico("Func " + (index+1), index + "0" + (index+1), "Escola básica " + (index+1), new Vendedor());
            }
            else if (index < 8) {
                funcionarios[index] = new FuncionarioEnsinoMedio("Func " + (index+1), (index+1) + "2" + index, "Escola básica " + (index+1), "Escola ensino médio "+ (index+1), new Supervisor());
            }
            else {
                funcionarios[index] = new FuncionarioGraduacao("Func " + (index+1), (index+1) + "1" + (index+2), "Escola básica " + (index+1), "Escola ensino médio "+ (index+1), "Universidade "+ (index+1), new Gerente());
            }
        }
        return funcionarios;
    }
}
