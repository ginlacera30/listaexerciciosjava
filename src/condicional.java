public class condicional {
    public static void main(String[] args) {
        double nota = 0.5;
        double frequencia = 0.90;

        if(nota >= 7.5 && frequencia >= 0.75) {
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno reprovado");
        }
    }
}
