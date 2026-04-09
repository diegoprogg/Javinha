package JavaIntermediario.Aulas.Aula12GetterESetter;

public class Uzumaki extends Ninja{
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + getNome() + " e eu sou um ninja Uzumaki da " + getAldeia());
    }
}
