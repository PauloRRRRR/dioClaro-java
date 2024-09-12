import java.util.Scanner; // Importa a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criando um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem para o usuário
        System.out.println("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine(); // Obtendo o nome do usuário

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt(); // Obtendo o número da conta

        System.out.println("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble(); // Obtendo o saldo inicial

        // Exibir mensagem de conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Inicial: R$ " + saldoInicial);

        // Fechando o scanner
        scanner.close();
    }
}
