import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor que deseja pegar emprestado (R$): ");
                double valorEmprestimo = scanner.nextDouble();

                System.out.print("Digite o número de parcelas deseja pagar (de 1 a 24): ");
                int numeroParcelas = scanner.nextInt();

                System.out.print("Digite o seu salário mensal (R$): ");
                double salario = scanner.nextDouble();

                if (numeroParcelas < 1 || numeroParcelas > 24) {
                    System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
                } else {
                    double valorParcela = valorEmprestimo / numeroParcelas;
                    if (valorParcela <= (salario * 0.3)) {
                        System.out.printf("Empréstimo aprovado. Valor de cada parcela:" + valorParcela);
                    } else {
                        System.out.println("Empréstimo reprovado. Parcela muito alta.");
                    }


        }

    }
}
