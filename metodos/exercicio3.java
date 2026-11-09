MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

      
        int maior = encontrarMax(num1, num2);

       
        System.out.println("O maior numero e: " + maior);

        scanner.close();
    }

    public static int encontrarMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
