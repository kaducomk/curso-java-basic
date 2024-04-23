import java.util.Scanner;
public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário");
        String nome = scanner.next();

        System.out.println("Insira o cargo do funcionário");
        String cargo = scanner.next();

        System.out.println("Insira o salário do funcionário");
        double salario = scanner.nextDouble();

        double inss = 0.1;
        double descontoInss = salario * inss;
        double ir = 0.15;
        double descontoIr = salario * ir;

        if (salario > 2500) {
            System.out.println("Salário bruto de " + nome + " é: R$" + salario +  "\nDesconto de INSS: R$" + descontoInss + "\nDesconto de IR: R$" + descontoIr + "\nSalário liquido é: R$ " + (salario - descontoInss - descontoIr));
        }else {
            System.out.println("Salário bruto de " + nome + " é: R$" + salario + "\nDesconto de INSS: R$" + descontoInss + "\nDesconto de IR: R$0,00" + "\nSalário liquido é: R$ " + (salario - descontoInss));
        }
    }
}
