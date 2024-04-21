import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo é de R$ " + saldo + " já está disponivel para saque");
    }
    
}




// numero da conta => Int / Agencia => String / Nome do cliente => String / saldo => double