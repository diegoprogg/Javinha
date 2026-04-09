package rascunhos;

public class Rascunho02Test {
    public static void main(String[] args) {
        Rascunho02 rascunho02 = new Rascunho02();
        rascunho02.setIdade(15);
        rascunho02.setNome("Gabriel");
        System.out.println("Olá " + rascunho02.getNome() + ", tudo bem? Você tem " + rascunho02.getIdade() + " anos!");
    }
}
