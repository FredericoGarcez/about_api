import java.util.Scanner;
public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("usuario123", "senha456");
        System.out.println("Digite o usuario:");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senhaDigitada = scanner.nextLine();

        try {
            boolean sucesso = login.fazer_login(usuarioDigitado, senhaDigitada);
            if (sucesso) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha inválidos.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}
