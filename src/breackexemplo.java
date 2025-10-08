public class breackexemplo {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            System.out.println("Testando o número: " + i);
            if(i == 7) {
                System.out.println("Número 7 encontrado!");
                break;
            }
        }
    }
}
