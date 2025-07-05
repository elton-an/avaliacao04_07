import java.util.Scanner;

public class Atividade01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                    String usuarioCorretoAdmin = "admin";
                    String senhaCorreta1234 = "1234";

                    System.out.print("Digite o nome de usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    if (usuario.equals(usuarioCorretoAdmin) && senha.equals(senhaCorreta1234)) {
                        System.out.println("Login bem-sucedido.");
                    } else {
                        System.out.println("Login inválido. Conta bloqueada.");
                    }
                }
            }
