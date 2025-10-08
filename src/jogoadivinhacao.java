import java.util.Random;
import java.util.Scanner;

public class jogoadivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int numeroSecreto = gerador.nextInt(100) + 1;
        int palpite;
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu pendei em um número entre 1 e 100. Tente adivinhar!");
        do {
            System.out.print("Qual o seu palpite?");
            palpite = leitor.nextInt();
            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            }

        } while (palpite != numeroSecreto);
        System.out.println("Parabéns! Você acertou o número secreto, que era " + numeroSecreto + "!");
        leitor.close();
    }
}
