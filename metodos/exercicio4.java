MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();
            
            boolean verificar = isPar(numero);
            
            if (verificar) {
                System.out.println("O numero é par");
            } else {
                System.out.println("O numero é impar");
            }
        }
        
        entrada.close();
    }

    public static boolean isPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
