package JavaBasico.Aulas.Arrays;

public class ExercicioArray02 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Naruto";
        nomes[1] = "Sasuke";
        nomes[2] = "Hinata";
        nomes[3] = "Kakashi";
        nomes[4] = "Sakura";

        for(int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

        // Ou, mais simplificado:

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
