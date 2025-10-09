import java.util.Scanner;
public class exercicionovo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario1 = "Giselle";
        String senha = "4546";

        System.out.print("Digite o nome de usuário: ");
        String usuarioDigitado = leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = leitor.nextLine();

        if (usuarioDigitado.equals(usuario1) && senhaDigitada.equals(senha)) {
            System.out.println("Bem vindo!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        leitor.close();
    }
}


