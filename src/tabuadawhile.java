import java.util.Scanner;

public class tabuadawhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
                int numero = leitor.nextInt();
                int multiplicador = 1;
            System.out.print("--- Tabuada do " + numero + " --- ");

        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
             System.out.print("\n" + numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        leitor.close();
    }
}



