// MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;

        while (contador <= 5) {

            double nota1;
            double nota2;
            
            do {
                System.out.println("------Aluno " + contador + " -------");
                System.out.println("Digite a primeira nota");
                System.out.println("São aceitos apenas numeros entre 0 e 10");
                nota1 = entrada.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota incorreta, o valor deve estar entre 0 e 10");
                }
            } while (nota1 < 0 || nota1 > 10);
            System.out.println("Nota valida: " + nota1);

            do {
                System.out.println("------Aluno " + contador + " -------");
                System.out.println("Digite a segunda nota");
                System.out.println("São aceitos apenas numeros entre 0 e 10");
                nota2 = entrada.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota incorreta, o valor deve estar entre 0 e 10");
                }
            } while (nota2 < 0 || nota2 > 10);
            System.out.println("Nota valida: " + nota2);

            double media = (nota1 + nota2) / 2;
            System.out.println("A media do " + contador + " aluno é " + media);

            contador++;
        }

        entrada.close();
    }
}