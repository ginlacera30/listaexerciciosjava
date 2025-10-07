import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Lado 1: ");
        int l1 = leitor.nextInt();
        System.out.print("Lado 2: ");
        int l2 = leitor.nextInt();
        System.out.print("Lado 3: ");
        int l3 = leitor.nextInt();

        if (l1 == l2 && l2 == l3) {
            System.out.println("Triângulo Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Triângulo Isósceles.");
        } else {
            System.out.println("Triângulo Escaleno.");
        }

        leitor.close();
    }
}
