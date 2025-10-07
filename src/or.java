public class or {
    public static void main(String[] args) {
        boolean cupomValido = false;
        double valorCompra = 100.00;

        if (cupomValido == true || valorCompra > 100.00) {
            System.out.println("Desconto Aplicado");
        } else {
            System.out.println(" Sem desconto desta vez. ");
        }
    }
}
