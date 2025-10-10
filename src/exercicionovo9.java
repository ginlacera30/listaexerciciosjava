import java.util.Scanner;
public class exercicionovo9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int numero;
        System.out.println("Digite um número positivo para começar e 0 para parar: ");
        do {
            System.out.println("Número: ");
            numero = leitor.nextInt();
            if (numero > 0) {
                soma = soma + numero;
            }

        } while (numero !=0);
        System.out.println("A soma é : " + soma);
        leitor.close();
    }
}
