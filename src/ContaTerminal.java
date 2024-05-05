import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Creating Scanner object:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Asking and saving the inputs from the user:
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
            // scanner.nextInt was causing problems with saving the input
            // but this isolated scanner.nextLine solves the problem

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();
            // Utilising scanner.next was causing problems, scanner.nextLine solved it
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldoConta = scanner.nextDouble();

        scanner.close();

        // Printing the data from the user:
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta +
                " já está disponível para saque");

    }

}
