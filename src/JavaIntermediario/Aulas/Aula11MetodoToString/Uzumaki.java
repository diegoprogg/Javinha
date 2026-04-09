package JavaIntermediario.Aulas.Aula11MetodoToString;

public class Uzumaki extends Ninja{
    public Uzumaki(){

    }

    public Uzumaki(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    @Override
    public String toString() {
        return "Olá, eu sou um ninja Uzumaki.";
    }
}
