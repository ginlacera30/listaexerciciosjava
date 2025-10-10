import java.util.Scanner;

public class exercicionovo24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] nomes = {"Ana", "Bruno", "Carla", "Daniel", "Eduarda", "Felipe"};

        System.out.print("Digite um nome para buscar: ");
        String busca = leitor.nextLine();

        boolean encontrado = false;

           for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome \"" + busca + "\" foi encontrado na lista!");
        } else {
            System.out.println("O nome \"" + busca + "\" NÃO foi encontrado na lista.");
        }

        leitor.close();
    }
}