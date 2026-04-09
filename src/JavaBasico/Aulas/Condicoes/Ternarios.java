package JavaBasico.Aulas.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        // Objetivo dos Ternários: Reduzir o código
        // O Ternário se usa na declaração da variável
        // Estrutura: variavel = (condicao) ? SeVerdadeiro : SeFalso
        // Exemplo:
        int missoes = 9;
        String nivelDoNinja = (missoes >= 10) ? "O Ninja possui 10 ou mais missões completas" : "O ninja possui menos de 10 missões completas";
        System.out.println(nivelDoNinja);
    }
}
