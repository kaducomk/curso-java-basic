import java.util.Scanner;

public class CaixaEletronico {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em conta");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o valor que quer sacar");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.err.println(saldo);
        }
    }
}
