package JavaIntermediario.Aulas.Aula12GetterESetter;

public abstract class Ninja implements apresentacaoNinja{

    private String nome;
    private String aldeia;
    private int idade;

    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá, meu nome é " + getNome() + " e eu sou um Ninja.");
    }
}
