package JavaIntermediario.Aulas.Aula01Objetos;

public class Main {
    public static void main(String[] args) {

        // Criando objeto Naruto
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;

        // Criando objeto Gaara
        Ninja gaara = new Ninja();
        gaara.nome = "Gaara";
        gaara.aldeia = "Vila da areia";
        gaara.idade = 18;

        System.out.println(naruto.nome);
        System.out.println(gaara.nome);
    }
}
