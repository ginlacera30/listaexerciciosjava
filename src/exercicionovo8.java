import java.util.Scanner;
public class exercicionovo8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = leitor.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println(" A nota digitada é inválida.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida : " + nota);
        leitor.close();
    }
}
