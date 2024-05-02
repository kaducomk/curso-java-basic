import java.util.Scanner;
public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual conversão fazer\n1- Celsius para Fahrenheit\n2- Fahrenheit para Celsius");
        int resp = scanner.nextInt();

        switch (resp) {
            case 1:
                converterCelsius();
                break;
            case 2:
                converterFahrenheit();
        
            default:
                break;
        }
    }

    public static void converterCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        int temp = scanner.nextInt();

        int tempConvert = (temp *9/5) + 32;

        System.out.println(temp + " graus Celsius é equivalente a " + tempConvert + " graus Fahrenheit");
    }

    public static void converterFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        int temp = scanner.nextInt();

        int tempConvert = (temp - 32) * 5/9;

        System.out.println(temp + " graus Fahrenheit é equivalente a " + tempConvert + " graus Celsius");
    }
    
}

