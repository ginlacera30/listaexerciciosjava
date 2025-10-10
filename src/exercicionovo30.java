import java.util.Scanner;
public class exercicionovo30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = {{1, 2, 3}, {2, 5, 12}, {20, 47, 14}};
        boolean numero = false;

        System.out.print("Digite um número para buscar na matriz: ");
        int numeroBusca = leitor.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == numeroBusca) {
                    System.out.println("O " + numeroBusca + " encontrado na linha " + linha + ", coluna " + coluna + ".");
                    numero = true;
                    break;
                }
            }
            if(numero) break;
        }

        if (!numero) {
            System.out.println("O número " + numeroBusca + " não foi encontrado na matriz.");
        }
        leitor.close();
    }
}
