import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double tarifa = 4.00;

                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.print("Você é estudante? (S): ");
                System.out.println("Você não é estudante (n) ");
                String estudante = scanner.next();

                double valorPagar;

                if (idade < 6 || idade > 65) {
                    valorPagar = 0.0;
                } else if (estudante.equals("s") && idade <= 25) {
                    valorPagar = tarifa / 2;
                } else {
                    valorPagar = tarifa;
                }

                System.out.printf("Valor a pagar:" + valorPagar);



    }
}
