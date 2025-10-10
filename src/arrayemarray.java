public class arrayemarray {
    public static void main(String[] args) {
        //Cria uma matriz 3x3
        int[][] tabuleiro = new int[3][3];
        //Preenche a posição na linha 0, coluna 1
        tabuleiro[0][1] = 1;
        //Preenche a posição na linha 2, coluna2
        tabuleiro[2][2] = 2;
        //Acessa e imprime o valor da linha 0, coluna 1
        System.out.println(tabuleiro[0][1]); //Saída: 1
        System.out.println(tabuleiro[2][2]);
    }
}
