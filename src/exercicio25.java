import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Caixa Eletrônico ---");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.print("Escolha uma operação: ");
        int operacao = leitor.nextInt();

        switch (operacao) {
            case 1: System.out.println("Ação: Verificando saldo..."); break;
            case 2: System.out.println("Ação: Realizando depósito..."); break;
            case 3: System.out.println("Ação: Realizando saque..."); break;
            default: System.out.println("Operação inválida."); break;
        }

        leitor.close();
    }
}
