//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que apresente na tela os quadrados dos 	números inteiros de 15 a 100.
//Exemplo:
//O quadrado de 15 é 225
//O quadrado de 16 é 256
//O quadrado de 100 é 10000

public class exercicio2 {
    public static void main(String[] args) {

        for (int i= 15; i<=100;i++){

            double x = Math.pow(i, 2);
            
            System.out.println("O quadrado de "+i+" é: "+x);
        }
        
    }
    
}
