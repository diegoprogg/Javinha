package JavaIntermediario.Aulas.Aula11MetodoToString;

public class Uchiha extends Ninja{
    public Uchiha(){

    }

    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    @Override
    public String toString() {
        return "Olá, eu sou um ninja Uchiha.";
    }
}
