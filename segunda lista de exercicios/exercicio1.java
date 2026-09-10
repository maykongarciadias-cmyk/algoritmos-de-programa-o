//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que leia um número inteiro.
//Se o número for maior que 20. . .
//calcular e imprimir a metade dele.

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");

        double n = entrada.nextInt();
        if(n > 20){
          double r = n/2;
          System.out.println("A metade do número é: "+r);
        }
        else{
            System.out.println("digite outro número.");
        }
        entrada.close();
    }
}

