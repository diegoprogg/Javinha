package JavaIntermediario.Aulas.Aula06ClassesAbstratas;

public class Senju extends Hokages{

    @Override
    public void sabedoriaHokage() {
        System.out.println("Sabedoria Hokage adquirida");
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá! Meu nome é " + nome + " e eu sou um Senju!");
    }
}
