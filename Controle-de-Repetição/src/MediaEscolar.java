import java.util.Scanner;

/**
 * MediaEscolar
 */
public class MediaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você deseja inserir?");
        int numeroNotas = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= numeroNotas; i++) {
            System.out.println("Insira a nota AV" + i + ":");
            double nota = scanner.nextDouble();
            soma+=nota; 
        }

        double media = soma /numeroNotas;

        System.out.println("A media é: " +  media);

        scanner.close();
    }
}