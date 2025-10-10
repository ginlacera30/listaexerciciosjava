public class matriznotaaluno {
    public static void main(String[] args) {
        double[][] notasAlunos = {
                {8.5,7.0}, //Nota aluno 1
                {9.0,8.0}, //Nota aluno 2
                {6.5,5.0}, //Nota aluno 3
        };
        //3.Percorrer cada linha da matriz(cada aluno)
        for (int linha = 0; linha < notasAlunos.length; linha++) {
            double soma= 0;
            //Percorre as colunas da linha atual(as notas do aluno)
            for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
                soma += notasAlunos[linha][coluna];
            }
            //4. Calcula a média e imprime
            double media = soma / notasAlunos[linha].length;
            System.out.println(" A média do Aluno " + (linha + 1) + " é: " + media);
        }
    }
}
