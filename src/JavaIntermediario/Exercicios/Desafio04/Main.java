package JavaIntermediario.Exercicios.Desafio04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ninjas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String novoNinja;
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o nome do " + (i + 1) + " ninja: ");
            novoNinja = scanner.nextLine();
            ninjas.add(novoNinja);
            System.out.println("Faltam " + (7 - (i + 1)));

        }

        while(true){

            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar um novo Ninja");
            System.out.println("2 - Remover o Primeiro Ninja");
            System.out.println("3 - Adicionar um Ninja ao Início");
            System.out.println("4 - Exibir lista completa");
            System.out.println("--------------------------------");

            Byte escolha = scanner.nextByte();
            scanner.nextLine();
            switch (escolha){
                case 1:
                    System.out.print("Digite o nome do Novo Ninja: ");
                    novoNinja = scanner.nextLine();
                    ninjas.add(novoNinja);
                    System.out.println("Adicionado!");
                    break;
                case 2:
                    System.out.println("Ninja " + "'" + ninjas.get(0) + "'" + " removido!");
                    ninjas.removeFirst();
                    break;
                case 3:
                    System.out.print("Digite o nome do Novo Ninja: ");
                    novoNinja = scanner.nextLine();
                    ninjas.addFirst(novoNinja);
                    System.out.println("Adicionado a posição inicial!");
                    break;
                case 4:
                    System.out.println("Lista Completa: " + ninjas);
                    break;
            }
        }
    }
}
