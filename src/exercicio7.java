import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite segundo numero: ");
        int numero2 = leitor.nextInt();

        System.out.println("Seu resultado é :  " + (numero1 + numero2));

        leitor.close();
    }
}
