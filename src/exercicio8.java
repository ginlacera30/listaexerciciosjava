import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        int soma = 365;
        soma = soma * idade;

        System.out.println("A sua idade em dias é aproximadamente : " + soma);
      leitor.close();
    }
}
