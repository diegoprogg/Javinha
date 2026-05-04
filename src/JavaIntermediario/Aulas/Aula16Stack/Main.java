package JavaIntermediario.Aulas.Aula16Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();
        historico.push("Google");
        historico.push("Twitter");
        historico.push("Instagram");
        System.out.println("Stack atual: " + historico);


        // Pop utilizado para remover o último elemento do "histórico"
        historico.pop();


        System.out.println("Stack atual: " + historico);

        // Peek utilizado para visualizar o último elemento do "histórico"
        System.out.println("Último elemento do Stack: " + historico.peek());


        // Size utilizado para identificar o tamanho do "histórico"
        System.out.println("Tamanho do Stack: " + historico.size());
    }
}
