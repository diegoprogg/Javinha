package JavaIntermediario.Aulas.Aula17Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> filaNinja = new LinkedList<>();
        filaNinja.add("Naruto");
        filaNinja.add("Sasuke");
        filaNinja.add("Kakashi");
        System.out.println("Fila: " + filaNinja);
        System.out.println("Tamanho da fila: " + filaNinja.size() + " ninjas.");
        System.out.println("Próximo do atendimento: " + filaNinja.peek());
        System.out.println("Atendido!");
        filaNinja.poll();
        System.out.println("Fila: " + filaNinja);
        System.out.println("Próximo do atendimento: " + filaNinja.peek());
        
    }
}
