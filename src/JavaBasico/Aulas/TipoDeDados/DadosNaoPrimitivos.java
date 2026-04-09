package JavaBasico.Aulas.TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Naruto";
        String aldeia = "Aldeia da Folha";

        // Nome em Maiúsculas & Minúsculas
        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);

        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nomeMinusculo);

        // Aldeia em Maiúsculas & Minúsculas

        String aldeiaMaiusculo = aldeia.toUpperCase();
        System.out.println(aldeiaMaiusculo);

        String aldeiaMinusculo = aldeia.toLowerCase();
        System.out.println(aldeiaMinusculo);
        
    }
}
