package JavaIntermediario.Aulas.Aula09SobrecargaConstrutores;

public abstract class Ninja {

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


}
