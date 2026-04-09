package JavaIntermediario.Aulas.Aula12GetterESetter;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da Folha", 18);
        sasuke.apresentacao();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.apresentacao();
    }
}
