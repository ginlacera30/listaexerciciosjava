import java.util.Scanner;
public class exercicionovo10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "4546gI@";
        String tentativa;
        do {
            System.out.println("Tente adivinhar a senha: ");
            tentativa = leitor.nextLine();
        } while (!tentativa.equals(senha));
        System.out.println("Senha correta. ");
        leitor.close();
    }
}
