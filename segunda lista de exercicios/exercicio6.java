////MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que leia a altura e o sexo de uma pessoa:
//calcule e mostre seu peso ideal.
//usar as formulas a seguir para calcular o peso ideal:
//para o sexo masculino: p72, 7 ˆ alturaq ´ 58
//para o sexo feminino: p62, 1 ˆ alturaq ´ 44, 7


import java.util.Scanner;
public class exercicio6 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Você é do sexo masculino true/false");
        boolean sexo = entrada.nextBoolean();

        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();

        if (sexo == true) {

            double pesoIdeal = 72.7 * altura - 58;

            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
        else {

            double pesoIdeal = 62.1 * altura - 44.7;

            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
    }
}