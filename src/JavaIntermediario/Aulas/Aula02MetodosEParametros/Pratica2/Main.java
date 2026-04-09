package JavaIntermediario.Aulas.Aula02MetodosEParametros.Pratica2;

public class Main {
    public static void main(String[] args) {

        // Objeto 1 - Naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";
        naruto.modoSabio();

        // Método verificar quantos anos faltam para se tornar Hokage
        System.out.println("Olá! Meu nome é " + naruto.nome + " e falta(m) " + naruto.anosParaVirarHokage(50) + " ano(s) para eu me tornar um Hokage!");

        System.out.println("-----------------------");

        // Objeto 2 - Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.Sharingan();

        // Método verificar quantos anos faltam para se tornar Hokage
        System.out.println("Olá! Meu nome é " + sasuke.nome + " e falta(m) " + sasuke.anosParaVirarHokage(50) + " ano(s) para eu me tornar um Hokage!");

        System.out.println("-----------------------");

        // Objeto 3 - Sakura
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da Folha";
        sakura.ativarCura();

        // Método verificar quantos anos faltam para se tornar Hokage
        System.out.println("Olá! Meu nome é " + sakura.nome + " e falta(m) " + sakura.anosParaVirarHokage(50) + " ano(s) para eu me tornar uma Hokage!");

        System.out.println("-----------------------");

        // Objeto 4 - Hinata
        Hyuuga hinata = new Hyuuga();
        hinata.nome = "Hinata Hyuuga";
        hinata.idade = 17;
        hinata.aldeia = "Aldeia da Folha";
        hinata.ativarByakugan();

        // Método verificar quantos anos faltam para se tornar Hokage
        System.out.println("Olá! Meu nome é " + sakura.nome + " e falta(m) " + sakura.anosParaVirarHokage(50) + " ano(s) para eu me tornar uma Hokage!");

        System.out.println("-----------------------");

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuuga Uzumaki";
        boruto.idade = 9;
        boruto.aldeia = "Aldeia da Folha";
        boruto.ativarKarma();
        boruto.ativarJougan();
        boruto.modoSabio();

    }
}
