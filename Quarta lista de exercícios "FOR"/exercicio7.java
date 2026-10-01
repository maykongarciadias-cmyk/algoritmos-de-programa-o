//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int contador = 0;
        int contIdade = 0;
        int contPeso = 0;
        double altura_total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- PESSOA " + i + " ---");

            System.out.println("Digite sua idade");
            int idade = entrada.nextInt();

            System.out.println("Digite sua altura");
            double altura = entrada.nextDouble();

            System.out.println("Digite seu peso");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                contIdade++;
            }

            if (idade >= 10 && idade <= 20) {
                contador++;
                altura_total += altura;
            }

            if (peso < 40) {
                contPeso++;
            }
        }

        System.out.println("\n=================================");
        System.out.println("A quantidade de pessoas maiores de 50 anos é: " + contIdade);

        if (contador > 0) {
            double media = altura_total / contador;
            System.out.println("A média das alturas (entre 10 e 20 anos) é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com idade entre 10 e 20 anos foi cadastrada.");
        }

        double percPeso = (contPeso / 10.0) * 100;
        System.out.println("A porcentagem de pessoas com peso inferior a 40 quilos é: " + percPeso + "%");

        entrada.close();
    }
}