package JavaIntermediario.Aulas.Aula07SuperClasses;

public abstract class Ninja implements habilidadeEspecial{
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
