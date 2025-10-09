public class listadecomprasexemplo {
    public static void main(String[] args) {
        String[] listaDeCompras = new String[5];
        listaDeCompras[0] = "Leite";
        listaDeCompras[1] = "Pão";
        listaDeCompras[2] = "Café";
        listaDeCompras[3] = "Maçã";
        listaDeCompras[4] = "Queijo";
        System.out.println("---Minha lista de compras---");
        for(int i=0; i<listaDeCompras.length; i++){
            System.out.println("Item: "+ (i+1)+":"+listaDeCompras[i]);

        }
    }
}
