import java.util.Scanner;

public class exercicionovo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você se classifica como Criança!");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você se classifica como Adolescente!");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você se classifica como Adulto!");
        } else {
            System.out.println("Você se classifica com Idoso!");
        }
        leitor.close();
    }
}
