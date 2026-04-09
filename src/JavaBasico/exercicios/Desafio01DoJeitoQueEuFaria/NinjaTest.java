package exercicios.Desafio01DoJeitoQueEuFaria;

public class NinjaTest {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja();
        ninja1.nome = "Naruto";
        ninja1.idade = 16;
        ninja1.missao = "Missão Bronze";
        ninja1.nivelMissao = 'B';
        ninja1.statusMissao = "Pendente";

        Ninja ninja2 = new Ninja();
        ninja2.nome = "Sasuke";
        ninja2.idade = 15;
        ninja2.missao = "Missão Ferro";
        ninja2.nivelMissao = 'B';
        ninja2.statusMissao = "Concluído";

        Ninja ninja3 = new Ninja();
        ninja3.nome = "Sakura";
        ninja3.idade = 14;
        ninja3.missao = "Missão Cobre";
        ninja3.nivelMissao = 'B';
        ninja3.statusMissao = "Pendente";

        ninja1.imprimir();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        ninja2.imprimir();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        ninja3.imprimir();
    }
}
