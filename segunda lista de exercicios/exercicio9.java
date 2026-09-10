//MAYKON GARCIA DIAS DO NASCIMENTO
//A prefeitura do Rio de Janeiro abriu uma linha de crédito para 	os funcionários estatuários.
//o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
//Exemplo:
//Salário bruto: 1200,00
//Valor da prestação: 400,00
//Empréstimo não pode ser concedido!

import java.util.Scanner;
public class exercicio9 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Insira o valor do seu salario");
        double s = entrada.nextDouble();
        System.out.println("Insira o valor da parcela que voce deseja pagar");
        double p = entrada.nextDouble();
        double limite = s*0.3;
        if (p>limite){
            System.out.println("Empréstimo não pode ser concedido!");
        }
        else{
            System.out.println("Empréstimo pode ser concedido!");
        }

}
}