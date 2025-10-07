import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 4 para a estação: ");
        int estacao = leitor.nextInt();
        switch (estacao) {
            case 1: System.out.println("Estação: Verão"); break;
            case 2: System.out.println("Estação: Outono"); break;
            case 3: System.out.println("Estação: Inverno"); break;
            case 4: System.out.println("Estação: Primavera"); break;
            default: System.out.println("Número inválido."); break;
        }
        leitor.close();
    }
}
