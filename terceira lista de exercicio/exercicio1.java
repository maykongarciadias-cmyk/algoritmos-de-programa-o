//MAYKON GARCIA DIAS DO NASCIMENTO
//Crie um algoritmo que leia um número de 1 a 7.
//imprima o dia da semana correspondente;
//assuma que 1 corresponde ao Domingo.

import java.util.Scanner;
public class exercicio1{
  public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um numero de 1 a 7");
    int dia = entrada.nextInt();

    switch(dia){
            case 1:
            System.out.println("Domingo");
            System.out.println("você selecionou o numero 1");
            break;

            case 2:
            System.out.println("segunda-feira");
            System.out.println("você selecionou o numero 2");
            break;

            case 3:
            System.out.println("terça-feira");
            System.out.println("você selecionou o numero 3");
            break;    

            case 4:
            System.out.println("quarta-feira");
            System.out.println("você selecionou o numero 4"); 
            break;

            case 5:
            System.out.println("quinta-feira");
            System.out.println("você selecionou o numero 5"); 
            break;

            case 6:
            System.out.println("sexta-feira");
            System.out.println("você selecionou o numero 6"); 
            break;

            case 7:
            System.out.println("sabado");
            System.out.println("você selecionou o numero 7"); 
            break;

            default:
            System.out.println("Número inválido. Digite um número de 1 a 7.");
            break;

    }

  }  
}
