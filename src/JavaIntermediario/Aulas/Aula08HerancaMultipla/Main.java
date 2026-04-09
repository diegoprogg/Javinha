package JavaIntermediario.Aulas.Aula08HerancaMultipla;

public class Main {
    public static void main(String[] args) {
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.ninjaDeElite();
        kakashi.sharinganAtivado();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.apresentacao();
        sasuke.sharinganAtivado();
    }
}
