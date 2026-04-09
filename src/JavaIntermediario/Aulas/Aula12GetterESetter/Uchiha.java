package JavaIntermediario.Aulas.Aula12GetterESetter;

public class Uchiha extends Ninja {

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + getNome() + " e eu sou um ninja Uchiha da " + getAldeia());
    }
}
