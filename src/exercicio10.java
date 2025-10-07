import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double celcios = leitor.nextDouble();
        double farenheits = celcios * 1.8 + 32;

        System.out.println("Temperatura em farenheits é: " + farenheits);
        leitor.close();
    }
}
