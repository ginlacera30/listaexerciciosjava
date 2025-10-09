import java.util.Scanner;
public class exercicionovo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Você é alfabetizado? (Digite 1 para Sim, 0 para Nao)");
        int alfabetizado = leitor.nextInt();
        if (idade >=18 && alfabetizado==1) {
            System.out.println("Aprovado para tirar a CNH. ");
        } else {
            System.out.println("Você não pode tirar a CNH. ");
        }
        leitor.close();
    }
}
