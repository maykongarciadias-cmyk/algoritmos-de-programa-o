//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo para ler um número inteiro.
//verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);
//se estiver:
//¨ imprimir “Pertence ao intervalo”;
//senão:
//¨ imprimir “Não pertence ao intervalo”

import java.util.Scanner;
public class exercicio5 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número inteiro");
        int n = entrada.nextInt();
        
        if (n>= 50 && n<= 100){
            System.out.println("Pertence ao intervalo");
        }
        else {
             System.out.println("Não pertence ao intervalo");
        }
     }
    }
