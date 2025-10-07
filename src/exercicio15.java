import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = leitor.nextDouble();
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso ideal.");
        } else {
            System.out.println("Classificação: Acima do peso.");
        }
        leitor.close();
    }
}



