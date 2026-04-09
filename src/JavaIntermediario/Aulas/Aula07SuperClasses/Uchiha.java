package JavaIntermediario.Aulas.Aula07SuperClasses;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidade() {
        System.out.println("Eu sou um Uchiha e essa é a minha habilidade especial!");
    }
}
