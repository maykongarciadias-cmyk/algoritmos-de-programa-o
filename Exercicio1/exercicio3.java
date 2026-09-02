//Construir um algoritmo para ler dois números inteiros:
// e imprimir o seu produto.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double x = entrada.nextDouble();


        System.out.println("Digite o segundo número");
        double y = entrada.nextDouble();

        double m = x * y;
        
        System.out.println("O valor do produto é: "+m);


        entrada.close();
    }
    
}
