package JavaIntermediario.Rascunhos;

public class ArrayTeste {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Pablo";
        nomes[1] = "Lucas";
        nomes[2] = "Romário";
        nomes[3] = "Diego";
        nomes[4] = "Alex";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
