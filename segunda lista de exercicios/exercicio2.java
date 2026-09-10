////MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que:
//receba a idade de uma pessoa;
//se for maior de idade imprima: “maior de idade”;
//senão imprima: “menor de idade”.

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite sua idade: ");

        double n = entrada.nextDouble();
        if(n>=18){
            System.out.println("Você é maior de idade.");
        }
        else{
            System.out.println("Você é menor de idade.");
        }
    }
    
}
