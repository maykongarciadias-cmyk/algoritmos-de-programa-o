// MAYKON GARCIA DIAS DO NASCIMENTO
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int acumulador =0;


        while (contador<=10){

            System.out.println("Insira sua altura em metros");
            double altura = entrada.nextDouble();

            System.out.println("Insira seu peso em kilos");
            double peso = entrada.nextDouble();

            double imc = peso/(altura*altura);
            System.out.println("O seu IMC é: "+ imc);

            if (imc>=18.5 && imc<=24.9){
                acumulador = acumulador + 1;
            }

            contador++;

            

        }
        System.out.println("\\nA quantidade de pessoas com IMC entre 18.5 e 24.9 (sem obesidade) é:"+acumulador);
        entrada.close();
    }

    
}
