package JavaIntermediario.Aulas.Aula05Construtores;

public class Hokages {
    String nome;
    int idade;
    double altura;
    boolean vivo;

    // Construtores servem pra definir características na criação do objeto


    // Allargs Constructor
    public Hokages(String nome, int idade, double altura, boolean vivo) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }


    // Noargs Constructor
    public Hokages() {
    }
}
