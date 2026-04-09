package JavaIntermediario.Aulas.Aula11MetodoToString;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Vila da Folha", 17);
        System.out.println(sasuke.toString());
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Vila da Folha", 16);
        System.out.println(naruto.toString());
    }
}
