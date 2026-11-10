import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[5];
        System.out.println("Digite 5 numeros inteiros");
        for (int i = 0; i < 5; i++){
            System.out.println("numero " + (i + 1));
            numero[i] = entrada.nextInt();
        }
        int maior = buscarMaior(numero);
        int menor = buscarMenor(numero);
        double media = mediaDosExtremos(numero);
        System.out.println("maior é " + maior);
        System.out.println("menor é " + menor);
        System.out.println("a media é " + media);
        entrada.close();
    }
    public static int buscarMaior (int[] vetor){
        int maior = vetor[0];
        for (int i = 0; i < 5; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static int buscarMenor (int[] vetor){
        int menor = vetor[0];
        for (int i = 0; i < 5; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
    public static double mediaDosExtremos (int[] vetor){
        int n1 = buscarMaior(vetor);
        int n2 = buscarMenor(vetor);
        double media = (n1 + n2) / 2.0; 
        return media;
    }
}
