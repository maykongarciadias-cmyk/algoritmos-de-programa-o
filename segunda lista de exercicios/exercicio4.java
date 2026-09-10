//MAYKON GARCIA DIAS DO NASCIMENTO
//Ler dois números (ponto flutuante) e apresentá-los em ordem 	decrescente.
//– supor que não sejam iguais.
import java.util.Scanner;
public class exercicio4 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o primeiro número");
        double n = entrada.nextDouble();
        System.out.println("Digite o segundo número");
        double x = entrada.nextDouble();

        if(n==x){
            System.out.println("Os numeros não podem ser iguais.");
        }
        else if(n>x){
        System.out.println(n);
        System.out.println(x);

        }
        else {
            System.out.println(x);
            System.out.println(n);
        }
}
}

