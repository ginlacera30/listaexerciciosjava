import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = leitor.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é o MAIOR.");
        }
                else if (num2 > num1) {
            System.out.println("O segundo número é o MAIOR.");
        } else {
            System.out.println("Os dois números são IGUAIS " );
        }

        leitor.close();
    }
}
