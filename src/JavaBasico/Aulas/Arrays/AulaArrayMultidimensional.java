package JavaBasico.Aulas.Arrays;

public class AulaArrayMultidimensional {
    public static void main(String[] args) {
        String[][] ninjaEAldeia = new String[2][2];
        ninjaEAldeia[0][0] = "Konoha";
        ninjaEAldeia[0][1] = "Naruto";

        ninjaEAldeia[1][0] = "Deserto";
        ninjaEAldeia[1][1] = "Gaara";

        for (int i = 0; i < ninjaEAldeia.length ; i++) {
            System.out.println("Aldeia: " + ninjaEAldeia[i][0] + " Ninja: " + ninjaEAldeia[i][1]);
        }
    }
}
