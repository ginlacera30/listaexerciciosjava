import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Você é cliente VIP? (1 para SIM, 0 para NÃO): ");
        int eVip = leitor.nextInt();
        System.out.print("Qual o valor da compra? R$ ");
        double valorCompra = leitor.nextDouble();

        if (eVip == 1 || valorCompra > 500.00) {
            System.out.println("Desconto concedido!");
        } else {
            System.out.println("Sem direito a desconto.");
        }

        leitor.close();
    }
}
