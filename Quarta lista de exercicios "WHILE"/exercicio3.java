//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numeroLimite = entrada.nextInt();

        int termo = 1;

        while (termo <= numeroLimite) {
            System.out.println(termo);
            termo = termo * 2;
        }

        entrada.close();
    }

}