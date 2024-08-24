package terminal;
public class BancoTerminal {
    public static void main(String[] args) {
        // Primeira execução: saldo = 25, valorSolicitado = 18
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        // Verifica se o saldo é maior ou igual ao valor solicitado
        if (saldo >= valorSolicitado) {
            // Se sim, subtrai o valor solicitado do saldo
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            // Se não, exibe mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente");
        }

        // Exibe o saldo após a operação
        System.out.println("Saldo atual: " + saldo);

        // Segunda execução: saldo = 15, valorSolicitado = 22
        saldo = 15.0;
        valorSolicitado = 22.0;

        // Verifica se o saldo é maior ou igual ao valor solicitado
        if (saldo >= valorSolicitado) {
            // Se sim, subtrai o valor solicitado do saldo
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            // Se não, exibe mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente");
        }

        // Exibe o saldo após a operação
        System.out.println("Saldo atual: " + saldo);
    }
    
}
