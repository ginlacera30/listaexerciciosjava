import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o total da conta do restaurante : ");
        double valorTotalConta = leitor.nextDouble();
        double TAXA_GORJETA = 0.10;
        double valorGorjeta = valorTotalConta * TAXA_GORJETA;

        System.out.println("O valor da gorjeta é: R$ " + valorGorjeta);
        leitor.close();
    }
}
