// MAYKON GARCIA DIAS DO NASCIMENTO
// Faça um algoritmo que receba dois números;
// execute as operações listadas a seguir
// de acordo com a escolha do usuário.
//
// M - média entre os números digitados
// S - diferença do maior pelo menor
// P - produto entre os números digitados
// D - divisão do primeiro pelo segundo

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double a = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        double b = entrada.nextDouble();

        // Limpa o Enter que ficou após o nextDouble()
        entrada.nextLine();

        System.out.println("Selecione o tipo de operação:");
        System.out.println("M: média entre os números digitados");
        System.out.println("S: diferença do maior pelo menor");
        System.out.println("P: produto entre os números digitados");
        System.out.println("D: divisão do primeiro pelo segundo");

        String operacao = entrada.nextLine();

        switch (operacao) {

            case "M":
                double m = (a + b) / 2;
                System.out.println("A média entre os números digitados é: " + m);
                break;

            case "S":
                if (a > b) {
                    double s = a - b;
                    System.out.println("A diferença do maior pelo menor é: " + s);
                } else {
                    double s = b - a;
                    System.out.println("A diferença do maior pelo menor é: " + s);
                }
                break;

            case "P":
                double p = a * b;
                System.out.println("O produto entre os números digitados é: " + p);
                break;

            case "D":
                if (b != 0) {
                    double d = a / b;
                    System.out.println("A divisão do primeiro pelo segundo é: " + d);
                } else {
                    System.out.println("Não é possível realizar a operação.");
                    System.out.println("O segundo número deve ser diferente de zero.");
                }
                break;

            default:
                System.out.println("Digite apenas uma das opções entre 'M', 'S', 'P' ou 'D'.");
                break;
        }

        entrada.close();
    }
}