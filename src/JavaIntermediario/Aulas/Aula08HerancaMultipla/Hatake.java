package JavaIntermediario.Aulas.Aula08HerancaMultipla;

public class Hatake extends Ninja implements Sharingan, AnbuInterface{

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + nome + "e eu sou um Hatake.");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Meu nome é: " + nome + " e eu sou um ninja de elite da Anbu!");
    }
}
