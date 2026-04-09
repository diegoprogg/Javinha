package JavaBasico.Aulas.Arrays;

public class AulaArray {
    public static void main(String[] args) {

        // Arrays são tipo referência, ou seja, fazem referência à um espaço em memória
        // String inicializa como null
        String[] nomes = new String[3];
        nomes[0] = "Diego";
        nomes[1] = "Gabriel";
        nomes[2] = "Lucas";
        System.out.println(nomes[0]);

        // int inicializa como 0
        int[] idades = new int[2];
        idades[0] = 16;
        idades[1] = 23;
        System.out.println(idades[1]);

        // boolean inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0] = true;
        System.out.println(verdadeiroOuFalso[0]);


    }
}
