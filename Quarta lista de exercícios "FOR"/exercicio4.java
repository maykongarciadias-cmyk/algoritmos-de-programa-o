//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que receba a idade e a altura de 10 pessoas:
//– calcule e mostre a média das alturas daquelas com mais de 50 anos.

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int contador = 0;
        double altura_total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite sua idade");
            int idade = entrada.nextInt();

            System.out.println("Digite sua altura");
            double altura = entrada.nextDouble();

            if (idade > 50) {
                contador++;
                altura_total += altura;
            }
        }

    
        if (contador > 0) {
            double media = altura_total / contador;
            System.out.println("A média é " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi cadastrada.");
        }

        entrada.close();
    }
}