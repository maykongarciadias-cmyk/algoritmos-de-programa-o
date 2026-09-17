//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que leia um inteiro entre 1 e 12;
//– imprima o nome do mês por extenso.

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um numero de 1 a 12");
    int mes = entrada.nextInt();

    switch(mes){
            case 1:
            System.out.println("Janeiro");
            System.out.println("você selecionou o numero 1");
            break;

            case 2:
            System.out.println("Fevereiro");
            System.out.println("você selecionou o numero 2");
            break;

            case 3:
            System.out.println("Março");
            System.out.println("você selecionou o numero 3");
            break;    

            case 4:
            System.out.println("Abril");
            System.out.println("você selecionou o numero 4"); 
            break;

            case 5:
            System.out.println("Maio");
            System.out.println("você selecionou o numero 5"); 
            break;

            case 6:
            System.out.println("Junho");
            System.out.println("você selecionou o numero 6"); 
            break;

            case 7:
            System.out.println("Julho");
            System.out.println("você selecionou o numero 7"); 
            break;

            case 8:
            System.out.println("Agosto");
            System.out.println("você selecionou o numero 8"); 
            break;

            case 9:
            System.out.println("Setembro");
            System.out.println("você selecionou o numero 9"); 
            break;

            case 10:
            System.out.println("Outubro");
            System.out.println("você selecionou o numero 10"); 
            break;

            case 11:
            System.out.println("Novembro");
            System.out.println("você selecionou o numero 11"); 
            break;

             case 12:
            System.out.println("Dezembro");
            System.out.println("você selecionou o numero 12"); 
            break;

            default:
            System.out.println("Número inválido. Digite um número de 1 a 12.");
            break;

    }

  }  
    
}
