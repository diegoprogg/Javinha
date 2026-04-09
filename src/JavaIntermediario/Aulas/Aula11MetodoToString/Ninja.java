package JavaIntermediario.Aulas.Aula11MetodoToString;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;


    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Olá, eu sou um ninja.";
    }
}
