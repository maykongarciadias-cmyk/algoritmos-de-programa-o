//Maykon Garcia Dias Do Nascimento
public class exercicio7 {
    public static void main(String[] args){

        boolean x1 = 120 - 30 == Math.pow(3.0,30.0);
        System.out.println("((120 - 30) = (3 ˆ 30)) = "+ x1);

        boolean x2 = (20%4.0/2==1||9!=9);
        System.out.println("(não ((20 módulo 4/2)= 1) ou (9 != 9)) = "+!x2);

        boolean x3 = 5%2>3;
        System.out.println("((5 módulo 2 ) > 3) = "+x3);


        String a = "a";
        String A = "A";

        boolean x4 = (a==A);
        System.err.println("(a=A) = " +x4);
    }
    
}
