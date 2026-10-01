//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int renan = 0;
        int flavio = 0;
        int lula = 0;
        int zema = 0;
        int nulo = 0;
        int branco = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- ELEITOR " + i + " ---");
            System.out.println("Digite o código do seu candidato:");
            System.out.println("1 - Renan Santos");
            System.out.println("2 - Flavio");
            System.out.println("3 - Lula");
            System.out.println("4 - Zema");
            System.out.println("5 - Voto Nulo");
            System.out.println("6 - Voto em Branco");
            System.out.print("Sua opção: ");
            
            int codigo = entrada.nextInt();

            while (codigo < 1 || codigo > 6) {
                System.out.println("Opção inválida! Digite um número de 1 a 6:");
                codigo = entrada.nextInt();
            }

            switch (codigo) {
                case 1:
                    renan++;
                    break;
                case 2:
                    flavio++;
                    break;
                case 3:
                    lula++;
                    break;
                case 4:
                    zema++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
            }
        }

        System.out.println("\n=================================");
        System.out.println("      RESULTADO DA ELEIÇÃO       ");
        System.out.println("=================================");
        System.out.println("Renan Santos: " + renan + " voto(s)");
        System.out.println("Flavio:       " + flavio + " voto(s)");
        System.out.println("Lula:         " + lula + " voto(s)");
        System.out.println("Zema:         " + zema + " voto(s)");
        System.out.println("Votos Nulos:  " + nulo + " voto(s)");
        System.out.println("Votos Branco: " + branco + " voto(s)");

        double percNulos = (nulo / 10.0) * 100;
        double percBrancos = (branco / 10.0) * 100;

        System.out.println("---------------------------------");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos em branco: " + percBrancos + "%");
        System.out.println("=================================");

        entrada.close();
    }
}