package JavaIntermediario.Exercicios.Desafio03;

public class Uchiha {

    public static void main(String[] args) {
        /* Crie uma subclasse chamada Uchiha que herda
        de Ninja. Adicione um atributo adicional
        habilidadeEspecial (String) e um método
        chamado mostrarHabilidadeEspecial() para exibir
        a habilidade especial do ninja.*/

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Pegar 10 bandidos";
        sasuke.nivelDificuldade = "Difícil";
        sasuke.statusMissao = "Pendente";
        sasuke.habilidadeEspecial = "Sharingan";
        sasuke.mostrarInformacoes();


    }
}
