package JavaIntermediario.Aulas.Aula14ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Naruto Uzumaki");
        System.out.println("Lista: " + nomes);
        nomes.add("Sasuke Uchiha");
        System.out.println("Lista: " + nomes);
        nomes.set(0, "Sakura Haruno");
        System.out.println("Lista: " + nomes);
        nomes.remove("Sasuke Uchiha");
        System.out.println("Lista: " + nomes);
    }
}
