//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;
public class exercicio12 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Insira o valor do seu salario");
        double s = entrada.nextDouble();
        if(s<=600){
            System.out.println("Isento");
        }
        else if(s>600 && s<=1200){
            double desconto = s*0.2;
            System.out.println("O desconto será de "+desconto);
        }
        else if(s>1200 && s<=2000){
            double desconto = s*0.25;
            System.out.println("O desconto será de "+desconto);
        }
        else if(s>2000){
            double desconto = s*0.3;
            System.out.println("O desconto será de "+desconto);
        }
     }
}
