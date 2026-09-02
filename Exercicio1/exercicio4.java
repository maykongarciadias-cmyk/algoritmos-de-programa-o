//Faça um algoritmo que leia quatro números inteiros.
// calcule e mostre a soma desses números.

import java.util.Scanner;

public class exercicio4 {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double a = entrada.nextDouble();
        System.out.println("Digite o segundo número");
        double b = entrada.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = entrada.nextDouble();
        System.out.println("Digite o quarto número");
        double d = entrada.nextDouble();

        double m = a+b+c+d;
        
        System.out.println("O valor do produto é: "+m);


        entrada.close();
    }
}
