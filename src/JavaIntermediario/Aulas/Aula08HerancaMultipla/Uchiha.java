package JavaIntermediario.Aulas.Aula08HerancaMultipla;

public class Uchiha extends Ninja implements Sharingan{

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + nome + "e eu sou um Uchiha.");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado!");
    }
}
