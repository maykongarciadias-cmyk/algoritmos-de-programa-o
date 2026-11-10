import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para calcular o fatorial: ");
        int n1 = entrada.nextInt();

        int resultado = calcularFatorial(n1);

        System.out.println("O resultado é: " + resultado);

        entrada.close();
    }

    public static int calcularFatorial(int num) {
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}