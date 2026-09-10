//MAYKON GARCIA DIAS DO NASCIMENTO
//Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário.
//sabendo que a senha é R10p5:
//¨ imprimir mensagem de “acesso concedido” ou “acesso negado”.
//Para comparar duas Strings utilizar o método equals();
import java.util.Scanner;
public class exercicio8 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite a senha");
        String senha = entrada.nextLine();

        if(senha.equals("R10p5")){
            System.out.println("acesso concedido");
        }
        else{
             System.out.println("acesso negado");
        }
     }
    }