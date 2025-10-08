import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("---MENU---");
            System.out.println("1 - Iniciar Jogo");
            System.out.println("2 - Ver Opções");
            System.out.println("0 - Sair");
            System.out.println("Digite sua opção: ");
            opcao = leitor.nextInt();
        }while(opcao != 0);
        System.out.println("Programa encerrado");
        leitor.close();
        }
    }

