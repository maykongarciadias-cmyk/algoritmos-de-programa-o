//MAYKON GARCIA DIAS DO NASCIMENTO
//Um funcionário receberá aumento de acordo com seu plano de trabalho.
//Faça um algoritmo que leia:
//o plano de trabalho;
//e o salário atual de um funcionário;
//Calcule e imprima o seu novo salário.
//plano a = 10%, 
//plano b = 15%, 
//plano c = 20%, 


import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite salario atual do funcionario");
        double salario = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Qual é o plano do funcionario?");
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        String plano = entrada.nextLine();

        switch (plano){

            case "a":
            double ns = salario+(salario*0.1);
            System.out.println("O valor do novo salario é: "+ ns);
            break;

            case "b":
            double ns1 = salario+(salario*0.15);
            System.out.println("O valor do novo salario é: "+ ns1);
            break;

            case "c":
            double ns2 = salario+(salario*0.2);
            System.out.println("O valor do novo salario é: "+ ns2);
            break;

            default:
            System.out.println("Digite apenas uma das opções entre 'a' 'b' ou 'c'");    



        }
    }
    
}
