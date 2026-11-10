import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        int vaiParaDentroDoMetodo = entrada.nextInt();
        String dia = exibirDiaSemana(vaiParaDentroDoMetodo);
        System.out.println("hoje é " + dia);
        
        entrada.close();
    }
    
    public static String exibirDiaSemana (int num){
        switch (num){
            case 1: return "domingo";
            case 2: return "segunda";
            case 3: return "terça";
            case 4: return "quarta";
            case 5: return "quinta";
            case 6: return "sexta";
            case 7: return "sabado";
            default: return "Dia da semana inválido";
        }
    }
}
