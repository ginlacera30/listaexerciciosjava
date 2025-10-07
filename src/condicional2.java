import java.util.Scanner;

public class condicional2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- MENU ---");
        System.out.println("1 - Salvar");
        System.out.println("2 - Carregar");
        System.out.println("3 - Sair");
        System.out.println("Digite uma opcao: ");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Salvando arquivo...");
                break;
                case 2:
                    System.out.println("Carregando arquivo...");
                    break;
                    case 3:
                        System.out.println("Saindo do sistema.");
                        break;
                        default:
                            System.out.println("Opcao invalido");
                            break;
        }
        leitor.close();
    }
}
