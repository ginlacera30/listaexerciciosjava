import java.util.Scanner;
public class exercicionovo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite aqui a nota do aluno: ");
        double nota = leitor.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado!");
            if (nota == 10.0) {
                System.out.println("Aprovado com distinção!");
            }
        } else {
            System.out.println("Reprovado!");
        }
        leitor.close();

    }
}
