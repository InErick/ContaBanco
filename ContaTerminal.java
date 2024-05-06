package ContaBanco;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a agência: ");
        String Agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String NomeCliente = scanner.nextLine();
        System.out.println("Digite o quanto deseja depositar: ");
        double Deposito = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso bansico, sua agência é "+Agencia+", conta "+numero+" e o seu saldo de "+Deposito+" já está disponivel para o saque");
    }
}