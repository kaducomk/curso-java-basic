/**
 * @author Carlos-Eduardo
 * @version 1.0
 * @since 30/04/2024
 */

import java.util.Scanner;
public class Conversor {

    /**
     * Este método é usado para converter a temperatura de Celsius para Fahrenheit.
     * @param scanner Foi colocado o Scanner para capturar a resposta do usuário.
     */
    public static void converterCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        float temp = scanner.nextFloat();

        float converterFahrenheit = (temp * 9/5) + 32;

        System.out.println(temp + " graus Celsius são " + converterFahrenheit + " graus Fahrenheit");
    }
    /**
     * Este método é usado para converter a temperatura de Fahrenheit para Celsius.
     * @param scanner Foi colocado o Scanner para capturar a resposta do usuário.
     */
    public static void converterFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        float temp = scanner.nextFloat();

        float converterCelsius = (temp * 9/5) + 32;

        System.out.println(temp + " graus Fahrenheit são " + converterCelsius + " graus Celsius");
    }
}
