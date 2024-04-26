import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println(contar(numero1, numero2));

        for (int i = 1; i <= contar(numero1, numero2); i++) {
            System.out.println(i);
        }
    }

    static int contar(int numero1, int numero2) {
        return  numero2 - numero1;
    }

}
