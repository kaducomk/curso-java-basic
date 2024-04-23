import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBaseVendedor = 2200;
        double comissao = 0;
        double bonificacao = 500;
        double salarioLiquido = 0;
        double impostoTotal = 0;

        System.out.println("Digite o nome do vendedor");
        String nome = scanner.next();

        System.out.println("Digite o valor da venda total");
        double vendaTotal =  scanner.nextDouble();

        if (vendaTotal <= 5000) {
            System.out.println("O funcionário vendeu R$" + vendaTotal + " e teve 5% de comissão");
            comissao = vendaTotal * 0.05;
            salarioLiquido = comissao + salarioBaseVendedor;
            System.out.println("Recebeu em comissão: R$" + comissao);
            System.out.println("O salario bruto de " + nome + " Será: R$" + (salarioLiquido));
        } else if (vendaTotal >= 5001 && vendaTotal <= 10000) {
            System.out.println("O funcionário vendeu R$" + vendaTotal + " e teve 10% de comissão");
            comissao = vendaTotal * 0.1;
            salarioLiquido = comissao + salarioBaseVendedor;
            System.out.println("Recebeu em comissão: R$" + comissao);
            System.out.println("O salario bruto de " + nome + " Será: R$" + (salarioLiquido));
        } else if (vendaTotal > 10001) {
            System.out.println("O funcionário vendeu R$" + vendaTotal + " e teve 15% de comissão");
            comissao = vendaTotal * 0.15;
            salarioLiquido = salarioBaseVendedor + comissao + bonificacao;
            System.out.println("Recebeu em comissão: R$" + comissao);
            System.out.println("Vendedor recebeu uma bonificação de R$500,00 por bater a meta mensal");
            System.out.println("############################################");
            System.out.println("O salario bruto de " + nome + " Será: R$" + (salarioLiquido));
        }
        if (salarioLiquido > 3100) {
            System.out.println("O seu salário ultrapassou R$ 3100,00");
            System.out.println("Sistema de impostos ativados!");
            System.out.println("Desconto INSS: R$" + (salarioLiquido * 0.1) + "\nImposto de renda: R$" + (salarioLiquido * 0.15));
            double ir = salarioLiquido * 0.15;
            double inss = salarioLiquido * 0.1;
            System.out.println("Seu salário com os descontos é: R$" + (salarioLiquido - ir - inss));
        }
    }

}

/*
 * Até R$ 5000,00: 5% de comissão
 * De R$ 5000,01 até R$ 10000,00: 10% de comissão
 * Acima de R$ 10000,00: 15% de comissão
 * 
 * O programa deve verificar se o valor total das vendas mensais supera uma meta
 * de vendas. Se superar, o vendedor recebe uma bonificação adicional de R$
 * 500,00.
 */