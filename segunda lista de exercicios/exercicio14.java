//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Você é alfabetizado? true/false");
        boolean alfabetizado = entrada.nextBoolean();

        System.out.println("Seu título eleitoral está regular? true/false");
        boolean tituloRegular = entrada.nextBoolean();

        if (idade < 16) {
            System.out.println("Não está apto a votar");
        }
        else if (tituloRegular == false) {
            System.out.println("Não está apto a votar");
        }
        else if (idade >= 16 && idade <= 17) {
            System.out.println("Está apto a votar - voto facultativo");
        }
        else if (idade >= 18 && idade <= 70 && alfabetizado == true) {
            System.out.println("Está apto a votar - voto obrigatório");
        }
        else {
            System.out.println("Está apto a votar - voto facultativo");
        }
    }
}