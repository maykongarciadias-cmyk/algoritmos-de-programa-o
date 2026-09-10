//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo para encontrar o maior número entre 3 	números inteiros.
//O algoritmo deve ler três inteiros;
//se forem todos iguais, imprimir: “os números são iguais”;
//caso contrário, imprimir o maior dos 3 números.

import java.util.Scanner;
public class exercicio10 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite o primeiro número inteiro");
        int n1 = entrada.nextInt();
        System.out.println("digite o segundo número inteiro");
        int n2 = entrada.nextInt();
        System.out.println("digite o terceiro número inteiro");
        int n3 = entrada.nextInt();
        if (n1==n2 && n2==n3){
            System.out.println("Os três numeros são iguais");
        }
        else if(n1>n2 && n1>n3){
            System.out.println("O maior numero é: "+n1);
        }else if (n2>n1 && n2>n3){
            System.out.println("O maior numero é: "+n2);
        }
        else{
            System.out.println("O maior numero é: "+n3);
        }
}
}
