public class exercicionovo20 {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 99, 4, 32, 77, 56, 1, 10, 23};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior valor no array é: " + maior);

    }
}
