// MAYKON GARCIA DIAS DO NASCIMENTO
// Leia o código do produto e a quantidade.
// Calcule o valor a ser pago pelo cliente.
// Imprima o valor a ser pago e o nome do produto.

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o código do produto:");
        int codigo = entrada.nextInt();

        switch (codigo){

            case 100:
            System.out.println("Cachorro quente");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade100 = entrada.nextInt();
            double total100 = 1.20 * quantidade100;
            System.out.println("O valor total é: " + total100);
            break;

            case 101:
            System.out.println("Bauru simples");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade101 = entrada.nextInt();
            double total101 = 1.30 * quantidade101;
            System.out.println("O valor total é: " + total101);
            break;

            case 102:
            System.out.println("Bauru com ovo");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade102 = entrada.nextInt();
            double total102 = 1.50 * quantidade102;
            System.out.println("O valor total é: " + total102);
            break;

            case 103:
            System.out.println("Hambúrguer");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade103 = entrada.nextInt();
            double total103 = 1.20 * quantidade103;
            System.out.println("O valor total é: " + total103);
            break;

            case 104:
            System.out.println("Cheeseburguer");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade104 = entrada.nextInt();
            double total104 = 1.30 * quantidade104;
            System.out.println("O valor total é: " + total104);
            break;

            case 105:
            System.out.println("Refrigerante");
            System.out.println("Qual é a quantidade você deseja?");
            int quantidade105 = entrada.nextInt();
            double total105 = 1.00 * quantidade105;
            System.out.println("O valor total é: " + total105);
            break;

            default:
            System.out.println("Digite apenas uma das opções entre '100' '101' '102' '103' '104' ou '105'");
            break;
        }
    }
}