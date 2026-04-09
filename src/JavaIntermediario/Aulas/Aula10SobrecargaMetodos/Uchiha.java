package JavaIntermediario.Aulas.Aula10SobrecargaMetodos;


public class Uchiha extends Ninja {

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

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Olá, meu nome é " + nome + ", sou um Uchiha, e essa é minha Inteligência de Combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 180){
            System.out.println("Olá, meu nome é " + nome + ", sou um Uchiha, e eu tenho inteligência de combate de gênio: " + qi);
        }else {
            System.out.println("Olá, meu nome é " + nome + ", sou um Uchiha, e essa é a minha inteligência de combate: " + qi);
        }
    }
}
