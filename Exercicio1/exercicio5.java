//Faça um algoritmo que leia três notas de um aluno:
// calcule e mostre a média aritmética do aluno.

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double a = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double b = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double c = entrada.nextDouble();
       
        double m = (a+b+c)/3;
        
        System.out.println("O valor do produto é: "+m);


        entrada.close();
    }
    
}
