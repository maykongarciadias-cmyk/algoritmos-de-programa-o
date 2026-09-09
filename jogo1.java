import java.util.Scanner;
public class jogo1{
public static void main (String[] args){

    Scanner entrada = new Scanner(System.in);
    double pontos = entrada.nextDouble();

    if (pontos >= 1000){
        System.out.println("paraben voce passou para fase 2");
    
    }
     System.out.println("siga para proxima etapa");
     entrada.close();
}
}
