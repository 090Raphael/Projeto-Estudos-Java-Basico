import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e armazena o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        // Solicita e armazena o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        scanner.nextLine(); // Consumir a linha pendente
        String agencia = scanner.nextLine();

        // Solicita e armazena o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e armazena o saldo inicial
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com as informações coletadas
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
