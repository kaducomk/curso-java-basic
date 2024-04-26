package 
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		somar();
	}
	
	public static void somar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma do numero " + numero1 + " com o numero " + numero2 + " é: " + soma);
		
		scanner.close();
	}
}
