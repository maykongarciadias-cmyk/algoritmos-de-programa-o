import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento");
        double x = entrada.nextDouble();

        System.out.println("Digite ano atual");
        double y = entrada.nextDouble();
        
        double idade = y-x;
        double idade30 = idade+30;

        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua idade em 2030 será: "+idade30);

    }
    
}
