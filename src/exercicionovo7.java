import java.util.Scanner;
public class exercicionovo7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para começar a contagem: ");
        int numero = leitor.nextInt();
        while (numero >=0) {
            System.out.println(numero);
            numero--;
        }
        leitor.close();
    }
}
