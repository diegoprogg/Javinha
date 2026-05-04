package JavaIntermediario.MeusDesafios.Des003;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String novoNome;
        boolean rodando = true;
        while (rodando){
            System.out.println("1 - Adicionar Nome");
            System.out.println("2 - Exibir nomes");
            System.out.println("3 - Sair");
            byte escolha = scanner.nextByte();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    System.out.print("Insira um novo nome: ");
                    novoNome = scanner.nextLine();
                    nomes.add(novoNome);
                    System.out.println("Nome " + "'" + novoNome + "'" + " Adicionado!") ;
                    break;

                case 2:
                    System.out.println("Nomes: " + nomes);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
    }
}
