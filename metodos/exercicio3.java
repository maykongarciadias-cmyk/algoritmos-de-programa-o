import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números fornecidos pelo usuário
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        // Chamada do método e armazenamento do retorno em uma variável
        int maior = encontrarMax(num1, num2);

        // Exibição do resultado
        System.out.println("O maior numero e: " + maior);

        scanner.close();
    }

    // Método que recebe dois inteiros como parâmetro e retorna o maior deles
    public static int encontrarMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}