package JavaIntermediario.Aulas.Aula10SobrecargaMetodos;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Adicionar 2 novos atributos

    String nome;
    String aldeia;
    int idade;
    boolean vivo;
    int missoesRealizadas;

    public abstract void apresentacao();

    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, boolean vivo, int missoesRealizadas ){
        this(nome, aldeia, idade);
        this.vivo = vivo;
        this.missoesRealizadas = missoesRealizadas;
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Olá, meu nome é " + nome + " e essa é minha Inteligência de Combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 180){
            System.out.println("Olá, meu nome é " + nome + " e eu tenho inteligência de combate de gênio: " + qi);
        }else {
            System.out.println("Olá, meu nome é " + nome + " e essa é a minha inteligência de combate: " + qi);
        }
    }
}
