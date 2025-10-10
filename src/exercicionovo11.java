import java.util.Scanner;

public class exercicionovo11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = leitor.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = leitor.nextInt();

        int resultado = 1;
        int contador = 0;

           while (contador < expoente) {
            resultado *= base;
            contador++;
        }

        System.out.println(base + " elevado a " + expoente + " é " + resultado);

        leitor.close();
    }
}