//MAYKON GARCIA DIAS DO NASCIMENTO

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int aprovados = 0;
        int reprovados = 0;
        int exame = 0;
        double soma_media =0;

        for (int i = 1; i <= 6; i++) {

            System.out.println("Digite a primeira nota");
            double n1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota");
            double n2 = entrada.nextDouble();

            double media = (n1+n2)/2;
            System.out.println("Sua media é "+media);

            if (media >= 7) {
                System.out.println("Aprovado");
                aprovados++;
            }
            else if (media > 3) {
                System.out.println("Exame");
                exame++;
            } 
            else {
                System.out.println("Reprovado");
                reprovados++;
            }

        soma_media += media;



        }
        System.out.println("--- RESULTADO DA CLASSE ---");
        System.out.println("Alunos aprovados "+aprovados);
        System.out.println("Alunos reprovados "+reprovados);
        System.out.println("Alunos de exame "+exame);
        double mediaClasse = soma_media/6;
        System.out.println("A media da sala é "+mediaClasse);

       

            
     }
    
 }  
