import java.util.Scanner;

public class Ativiade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                System.out.print("Digite um número inteiro entre 1 e 7: ");
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 7) {

                    switch (numero) {
                        case 1:
                            System.out.println("Domingo");
                            break;
                        case 2:
                            System.out.println("Segunda-feira");
                            break;
                        case 3:
                            System.out.println("Terça-feira");
                            break;
                        case 4:
                            System.out.println("Quarta-feira");
                            break;
                        case 5:
                            System.out.println("Quinta-feira");
                            break;
                        case 6:
                            System.out.println("Sexta-feira");
                            break;
                        case 7:
                            System.out.println("Sábado");
                            break;
                    }
                } else {
                    System.out.println("Número inválido. Digite um número entre 1 e 7.");

        }

    }
}
