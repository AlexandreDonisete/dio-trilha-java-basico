import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite a Agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite seu Nome!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}