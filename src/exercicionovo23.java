public class exercicionovo23 {
    public static void main(String[] args){
        int[] numero1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contador = 0;

        for (int numero : numero1) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Existem " + contador+ " números pares." );
    }
}
