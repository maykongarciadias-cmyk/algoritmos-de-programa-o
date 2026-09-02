//Faça um algoritmo que calcule e imprima o valor de cada 	expressão a seguir:
//(20 - 15)/2
//2 ˆ (5/20) + 30 / (15 ˆ 2)
//35 / (6 + 2)
//23 módulo 4

public class exercicio6 {
    public static void main(String[] args) {
        
        double x = (20 - 15)/2.0;
        System.out.println("(20 - 15)/2 = "+x);


        // Cálculo do primeiro termo: 2 ^ (5 / 20)
        double termo1 = Math.pow(2.0, 5.0 / 20.0);
        
        // Cálculo do segundo termo: 30 / (15 ^ 2)
        double termo2 = 30.0 / Math.pow(15.0, 2.0);
        
        // Soma dos dois termos
        double resultado = termo1 + termo2;
         System.out.println("2ˆ(5/20) + 30/(15ˆ2) = "+resultado);


         double y = 35.0/(6+2);

         System.out.println("35 / (6 + 2) = "+y);

         double modulo = 23%4;
         System.err.println("23 módulo 4 ="+modulo);


    }
    
}
