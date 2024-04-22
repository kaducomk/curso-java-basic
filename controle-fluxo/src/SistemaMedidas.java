import java.util.Scanner;


public class SistemaMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tamanho");
        String siglas = scanner.next();

        switch (siglas) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
