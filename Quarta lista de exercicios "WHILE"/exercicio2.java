//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int pares = 0;
        int impares = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + "º número:");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        entrada.close();
    }

} 
    

