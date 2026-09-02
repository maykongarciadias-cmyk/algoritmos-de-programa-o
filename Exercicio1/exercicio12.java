import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número");
         double x = entrada.nextDouble();

         double a = Math.pow(x,2.0);
         double b = Math.pow(x,3.0);
         double c = Math.sqrt(x);
         double d = Math.pow(x,10.0);

         System.out.println("N^2: "+a);
         System.out.println("N^3: "+b);
         System.out.println("Raiz quadrada: "+c);
         System.out.println("N^10: "+d);



    }
    
}
