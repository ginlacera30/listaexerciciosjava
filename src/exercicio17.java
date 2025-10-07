import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();
        System.out.print("Você tem convite? (1 para SIM, 0 para NÃO): ");
        int temConvite = leitor.nextInt();

        if (idade >= 18 && temConvite == 1) {
            System.out.println("Entrada permitida.");
        } else {
            System.out.println("Entrada não permitida.");
        }

        leitor.close();
    }
}
