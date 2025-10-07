import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Cardápio ---");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Pizza");
        System.out.println("3 - Sopa");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1: System.out.println("Você escolheu Hambúrguer."); break;
            case 2: System.out.println("Você escolheu Pizza."); break;
            case 3: System.out.println("Você escolheu Sopa."); break;
            default: System.out.println("Opção inválida."); break;
        }

        leitor.close();
    }
}
