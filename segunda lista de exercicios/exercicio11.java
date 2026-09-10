//MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;
public class exercicio11 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite a sua idade");
        int idade = entrada.nextInt();
        if (idade>=5 && idade<=7){
            System.out.println("infantil A");
        }
        else if(idade>=8 && idade<=10){
            System.out.println("infantil B");
        }
        else if(idade>=11 && idade<=13){
            System.out.println("juvenil A");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("juvenil B");
        }
        else if(idade>=18){
            System.out.println("Senior");
        }
        else {
    System.out.println("Idade não pertence a nenhuma categoria");
        }
}
}