import java.util.Scanner;
public class CalculadoraExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero");
        int numero2 = scanner.nextInt();

        System.out.println("Qual operação deseja fazer?\n1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            int somar = numero1 + numero2;
            System.out.println("O resultado da soma é: " + somar);
        }else if(resposta == 2) {
            int subtrair = numero1 - numero2;
            System.out.println("O resultado da sbtração é: " + subtrair);
        }else if(resposta == 3) {
            int multiplicar = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + multiplicar);
        }else if(resposta == 4) {
            int dividir = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + dividir);
        }else {
            System.out.println("Operação invalida");
        }
    }
}