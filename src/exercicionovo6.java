import java.util.Scanner;
public class exercicionovo6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código do setor(100, 200 ou 300): ");
        int setor = leitor.nextInt();
        switch (setor) {
            case 100: System.out.println("Setor Adiministrativo."); break;
            case 200: System.out.println("Setor Financeiro."); break;
            case 300: System.out.println("Setor RH."); break;
            default: System.out.println("Erro ao tentar digitar o setor."); break;
        }
        leitor.close();
    }
}
