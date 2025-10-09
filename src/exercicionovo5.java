import java.util.Scanner;
public class exercicionovo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);
        double resultado = 0;
        switch (operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
        }
        System.out.println("Resultado: " + resultado);
        leitor.close();
    }
}
