package JavaIntermediario.Exercicios.Desafio03;

public class Ninja {

    /* Na classe Ninja, defina os atributos nome
            (String), idade (int), missao (String),
    nivelDificuldade (String) e statusMissao (String).
    Adicione um método chamado
    mostrarInformacoes() que exibe todos esses
    atributos.*/

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    String habilidadeEspecial;


    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de Dificuldade da Missão: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
        System.out.println("Habilidade Especial do Ninja: " + habilidadeEspecial);
    }


}
