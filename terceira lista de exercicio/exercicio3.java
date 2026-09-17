//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que leia o período em que um aluno estuda:
//M - Matutino;
//V - Vespertino;
//N - Noturno.
//Escreva uma das opções a seguir:
//Opção	Saudação
//M	bom dia
//V	boa tarde
//N	boa noite

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Em qual periodo você estuda?");
        System.out.println("Digite m para Matutino");
        System.out.println("Digite v para Vespertino");
        System.out.println("Digite n para Noturno");

        String turno = entrada.nextLine();

        switch (turno){

            case "m": 
            System.out.println("Bom dia");
            break;

            case "n":
            System.out.println("Boa noite");
            break;

            case "v":
            System.out.println("Boa tarde");
            break;

            default:
            System.out.println("Digite apenas uma das opções entre 'm' 'n' ou 'v'");
        }

    }
    
}
