public class exercicionovo21 {
    public static void main(String[] args) {

        int[] numeros = {15, 8, 99, 4, 32, 77, 56, 1, 10, 23};
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O menor valor no array é: " + menor);
    }
}