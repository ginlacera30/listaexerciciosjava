public class exercicionovo29 {
    public static void main(String[] args) {
        double soma = 0;
        double[][] notas = {
                {9.5, 9.0, 9.5},
                {2.0, 8.0, 5.5},
                {6.0, 5.0, 9.0},
                {10.0, 9.5, 9.0} ,
        };

        for (int linha = 0; linha < notas.length; linha++) {
            for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                soma += notas[linha][coluna];
            }
            double media = soma / notas[linha].length;
            System.out.println("A média do Aluno " + (linha + 1) + " é: " + media);
        }
    }
}
