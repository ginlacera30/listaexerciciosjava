import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leitor.nextInt();

        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        leitor.close();
    }
}
