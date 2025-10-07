import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a nota do aluno de 0 a 10: ");
         double nota = leitor.nextDouble();
        if (nota <= 7.0) {
            System.out.println("A nota é " + nota + ". Parabéns! Aprovado!");
        } else {
            System.out.println(" Sua nota é menor que 7.0 . Reprovado!");
        }
        leitor.close();
    }
}
