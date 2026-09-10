//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = entrada.nextDouble();

        System.out.println("Digite a operação (+, -, * ou /):");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            double soma = n1 + n2;
            System.out.println(soma);
        }
        else if (operacao == '-') {
            double subtracao = n1 - n2;
            System.out.println(subtracao);
        }
        else if (operacao == '*') {
            double multiplicacao = n1 * n2;
            System.out.println(multiplicacao);
        }
        else if (operacao == '/') {

            if (n2 <= 0) {
                System.out.println("Impossível dividir!");
            }
            else {
                double resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            }
        }
        else {
            System.out.println("Sinal Inválido");
        }
    }
}