// MAYKON GARCIA DIAS DO NASCIMENTO
// Faça um algoritmo que leia dez números inteiros e positivos 
// mostre o menor entre eles.

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int indice = 1;
        int menor = 0; 

        while (indice <= 10) {
            System.out.print("Digite o " + indice + "º número inteiro e positivo: ");
            int x = entrada.nextInt();

            
            if (indice == 1 || x < menor) {
                menor = x;
            }

            indice++;
        }

        System.out.println("O menor número digitado foi: " + menor);
        
        entrada.close();
    }
}