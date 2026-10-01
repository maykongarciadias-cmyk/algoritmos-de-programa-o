//MAYKON GARCIA DIAS DO NASCIMENTO
//Ler um número inteiro e imprimir na tela a sequência de 	números que vai do número 1 até o número lido.
//– Exemplo:
//¨ Digite um número:
//¨ 8
//¨ Sequência: 1 2 3 4 5 6 7 8.
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um numero");
        int numero = entrada.nextInt();
       

        for (int i=1; i<=numero;i++){

           
            System.out.println(i);
        }
    }
}

        