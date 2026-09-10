//MAYKON GARCIA DIAS DO NASCIMENTO
//A empresa XSoftware concedeu um bônus de 20% do valor do salário a 	
// todos os funcionários com tempos de trabalho na empresa igual ou 	
// superior a cinco anos e de 10% aos demais funcionários.
//Faça um algoritmo que leia o salário e a quantidade de anos de cada 	
// funcionário, calcule e imprima o valor do bônus.

import java.util.Scanner;
public class exercicio7 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Quanto tempo de empresa o funcionario possui?");
        double t = entrada.nextDouble();
        System.out.println("Qual é o salario base do funcionario?");
        double s = entrada.nextDouble();

        if(t >= 5){
            double bonus = s*0.2;
            System.out.println("seu bonus é de "+bonus+" reais");
        }
        else {
            double bonus = s*0.1;
            System.out.println("seu bonus é de "+bonus+" reais");
        }
     }
    }

