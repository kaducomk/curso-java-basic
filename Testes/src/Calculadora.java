/**
 * ListaUsuario
 */
public class Calculadora {

    public int adicao(int x, int y){
        int soma = x + y;
        System.out.println("O resultado da soma de " + x + " e " + y + " é: " + soma);
        return soma;
    }

    public int subtracao(int x, int y) {
        return x - y;
    }

    public int multiplicacao(int x, int y) {
        return x * y;
    }

    public int divisao(int x, int y) {
        return x / y;
    }

}