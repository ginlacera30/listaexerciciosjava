import  java.util.Scanner;
public class menuwhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Fazer Ação 1");
            System.out.println("2 - Fazer Ação 2");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = leitor.nextInt();
            switch (opcao) {
            case 1: System.out.println("Executando Ação 1..."); break;
                case 2: System.out.println("Executando Ação 2..."); break;
                case 3: System.out.println("Executando Ação 3..."); break;
                default: System.out.println("Opção inválida! Tente novamente."); break;
            }
        }
        leitor.close();
    }
}


