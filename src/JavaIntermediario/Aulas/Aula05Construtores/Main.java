package JavaIntermediario.Aulas.Aula05Construtores;

public class Main{
    public static void main(String[] args) {

        Hokages minato = new Hokages("Minato Namikaze", 45, 1.80, true);
        System.out.println("Olá! Meu nome é " + minato.nome + ", tenho " + minato.idade + " anos e tenho " + minato.altura + " de altura.");

    }
}
