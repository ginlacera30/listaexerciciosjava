import  java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Seu sobre-nome: ");
        String sobrenome = leitor.nextLine();
        System.out.println("Olá,  " + nome +" " + sobrenome );
        leitor.close();
    }
}
