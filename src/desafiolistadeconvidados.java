import java.util.Scanner;

public class desafiolistadeconvidados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(" Quantos  convidados você deseja adicionar? : ");
        int numeroDeConvidados = leitor.nextInt();
        leitor.nextInt();
        String[] listaDeConvidados = new String[numeroDeConvidados];

        System.out.println("\nCerto! Agora, digite o nome de cada um dos ");
        for (int i = 0; i < listaDeConvidados.length; i++) {
            System.out.print("Convidado " + (i + 0) + ": ");
            listaDeConvidados[i] = leitor.nextLine();

            System.out.println("\n--- Lista Final de Convidados Adicionados---");}
            for (int i = 0; i < listaDeConvidados.length; i++) {

                System.out.println("- "  + listaDeConvidados[i]);
            }

            leitor.close();
        }
    }
