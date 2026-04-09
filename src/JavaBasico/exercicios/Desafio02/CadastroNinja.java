package exercicios.Desafio02;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos ninjas você deseja cadastrar?");
        int quantidadeNinjas = scanner.nextInt();
        String[] nomesNinjas = new String[quantidadeNinjas];

        while (true){
            System.out.println("----------- Menu -----------");
            System.out.println("1 - Cadastrar um ninja ");
            System.out.println("2 - Exibir ninja(s)");
            System.out.println("3 - Sair");
            System.out.println("----------- Menu -----------");
            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaMenu){
                case 1:
                    for (int i = 0; i < nomesNinjas.length; i++) {
                        System.out.println("Nome do Ninja " + (i + 1) + ": ");
                        nomesNinjas[i] = scanner.nextLine();
                    }
                    break;

                case 2:
                    for (int i = 0; i < nomesNinjas.length; i++) {
                        System.out.println("Ninja " + (i + 1) + ": " + nomesNinjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;


            }

        }
    }
}
