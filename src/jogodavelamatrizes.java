import java.util.Scanner;
public class jogodavelamatrizes {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        Scanner leitor = new Scanner(System.in);
        char jogadorAtual = 'X';
        boolean jogoAcabou = false;
        int turno = 0;
        //O jogo continua enquanto não acaba e houve turnos disponíveis
        while (!jogoAcabou && turno < 9) {

            imprimirTabuleiro(tabuleiro);
            System.out.println("\n--- Vez do Jogador '" + jogadorAtual + "' ---");
            System.out.print("Digite a linha (0, 1 ou 2): ");
            int i = leitor.nextInt();
            System.out.print("Digite a coluna (0, 1 ou 2): ");
            int j = leitor.nextInt();

            //Verifica se a jogada é valida (dentro do tabuleiro e em posição vazia)
            if (i >= 0 && i < 3 && j >= 0 && j < 3 && tabuleiro[i][j] == ' ') {
                tabuleiro[i][j] = jogadorAtual;

                //verificar se jogador atgual venceu
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    System.out.println("\n---Fim de Jogo! ---");
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("O Jogador '" + jogadorAtual + "' venceu!");
                    jogoAcabou = true;
                } else {
                    //Troca o jogador
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                    turno++;

                    //Verificar se deu empate
                    if (turno == 9) {
                        System.out.println("\n---Fim de Jogo! ---");
                        imprimirTabuleiro(tabuleiro);
                        System.out.println("O Jogador terminou em EMPATE!");
                        jogoAcabou = true;
                    }
                }
            } else {
                System.out.println("Posição inválida ou já ocupada! Tente novamente!");
            }
        }
        leitor.close();
    }

    //Novo método: Função que verifica se há vencedor
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {

            return true;
        }
    }
    // Verificar colunas
    for (int i = 0; i < 3; i++) {

        if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
            return true;
        }
    }

        // verificar diagonais
    if (tabuleiro[0][0] == jogador && tabuleiro [1][1] == jogador && tabuleiro[2][2] == jogador) {
        return true;
    }
    if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
        return true;
    }
    // Se nenhuma dass condições acima for atendida, não há vencedor
        return false;
    }
    // Metodo para imprimir o tabuleiro formatado
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n 0    1   2 \n");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");

            }
        }
    }

