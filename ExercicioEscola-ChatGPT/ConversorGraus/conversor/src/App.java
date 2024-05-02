import java.util.Scanner;


public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao programa de conversor de Temperatura\nAntes de tudo vamos fazer o seu cadastro!");

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu estado");
        String estado = scanner.next();

        System.out.println("Digite sua cidade");
        String cidade = scanner.next();

        Usuario user1 = new Usuario();
        user1.setNome(nome);
        user1.setIdade(idade);
        user1.setEstado(estado);
        user1.setCidade(cidade);

        System.out.println("Qual operação deseja fazer?\n1- Converter Celsius em Fahrenheit\n2- Fahrenheit em Celsius");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                Conversor.converterCelsiusToFahrenheit();
                break;
            case 2:
                Conversor.converterFahrenheitToCelsius();
                break;
        
            default:
                System.out.println("Opção invalida");
                break;
        }
    }

}