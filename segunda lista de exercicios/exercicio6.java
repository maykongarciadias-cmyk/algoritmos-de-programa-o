////MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que leia a altura e o peso de uma pessoa:
//calcule e mostre seu IMC
//usar as formulas a seguir para calcular o peso ideal:
//A fórmula do IMC (Índice de Massa Corporal) é peso (kg) ÷ [altura (m) × altura (m)],


import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura em metros:");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso em kg:");
        double peso = entrada.nextDouble();

        // Fórmula do IMC: peso / (altura * altura)
        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        entrada.close();
    }
}
