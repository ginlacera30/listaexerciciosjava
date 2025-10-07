import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o código do produto (1 a 4): ");
        int codigo = leitor.nextInt();

        switch (codigo) {
            case 1: System.out.println("Categoria: Alimento não-perecível"); break;
            case 2: System.out.println("Categoria: Alimento perecível"); break;
            case 3: System.out.println("Categoria: Higiene"); break;
            case 4: System.out.println("Categoria: Limpeza"); break;
            default: System.out.println("Código inválido."); break;
        }
        leitor.close();
    }
}

