import java.util.Scanner;
public class acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int numero;
        System.out.println("Digite um número para somar (digite 0 para parar): ");
        numero = leitor.nextInt();
        while (numero != 0) {
            soma = soma + numero;
            System.out.println("Digite o próximo número(ou 0 para parar): ");
            numero = leitor.nextInt();
        }
        System.out.println("A soma total foi: " + soma);
        leitor.close();
    }
}
