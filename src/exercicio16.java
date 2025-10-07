import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.print("Digite seu tempo de contribuição (anos): ");
        int contribuicao = leitor.nextInt();

        if (idade >= 65 || contribuicao >= 30) {
            System.out.println("Você pode se aposentar.");
        } else {
            System.out.println("Você ainda não pode se aposentar.");
        }
        leitor.close();

    }
}
