package JavaIntermediario.Aulas.Aula04Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
    }
}
