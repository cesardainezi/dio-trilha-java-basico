import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private static int numeroConta;
    private static String numeroAgencia, nomeCliente;
    private static float saldoDisponivel;
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // Consome '\n'

        System.out.println("Agora, digite o número agência!");
        numeroAgencia = scanner.nextLine();

        System.out.println("Informe o nome do cliente.");
        nomeCliente = scanner.nextLine();

        System.out.println("Finalmente, informe o saldo disponível do cliente.");
        saldoDisponivel = scanner.nextFloat();

        String mensagem = "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoDisponivel
                + " já está disponível para saque.";

        System.out.println(mensagem);

    }
}
