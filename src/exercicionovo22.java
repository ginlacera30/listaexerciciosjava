import java.util.Arrays;
public class exercicionovo22 {
    public static void main(String[] args) {
        int[] original =  {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];
        int j = original.length;
        for (int i = 0; i < original.length; i++) {
            invertido[j - 1] = original[i];
            j = j - 1;
        }
        System.out.println("Array original: " + Arrays.toString(original));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }
}
