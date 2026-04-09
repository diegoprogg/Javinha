package JavaIntermediario.Aulas.Aula09SobrecargaConstrutores;

public class Uchiha extends Ninja{

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + nome + " e eu sou um Uchiha.");
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, boolean vivo, int missoesRealizadas){
        super(nome, aldeia, idade, vivo, missoesRealizadas);
    }
}
