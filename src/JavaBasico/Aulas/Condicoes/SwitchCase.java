package JavaBasico.Aulas.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostra opções ao usuário
        System.out.println("Escolha um Ninja:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int escolhaDoUsuario = scanner.nextInt();

        // Casos para cada escolha do usuário
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você digitou uma opção não válida. Escolha novamente.");
        }
    }
}
