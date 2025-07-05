import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota 0 a 100");
        int nota = scanner.nextInt();
        String conceito = "";

        if (nota >= 90 && nota <= 100) {
            conceito = "A";
        }else if (nota >= 80 && nota <= 89) {
            conceito = "B";
        } else if (nota >= 70 && nota <= 79) {
            conceito = "C";
        } else if (nota >= 60 && nota <= 69) {
            conceito = "D";
        } else if ( nota < 60 ) {
            conceito = "F";

        }
        System.out.println("Sua nota é " + conceito);
    }



}
