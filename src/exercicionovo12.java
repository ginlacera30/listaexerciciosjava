import java.util.Scanner;

public class exercicionovo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("---MENU----");
            System.out.println("1 - Opção 01");
            System.out.println("2 - Opção 02");
            System.out.println("3 - Opção 03");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1: System.out.println("Você escolheu a Opção 01."); break;
                case 2: System.out.println("Você escolheu a Opção 02."); break;
                case 3: System.out.println("Você escolheu a Opção 03."); break;
                case 4: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida."); break;
            }
        }
    }
}
