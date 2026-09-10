//Ler dois valores inteiros:
//e se forem iguais, mostrar “Números iguais”;
//caso contrário, apresentar a diferença do maior pelo menor.

import java.util.Scanner;
public class exercicio3 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o primeiro número inteiro");
        int n = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int x = entrada.nextInt();
        if(n==x){
            System.out.println("Números iguais");
        }
        else if(n>x){
        System.out.println(n - x);
        }
        else {
            System.out.println(x - n);
        }
}
}
