package JavaBasico.Aulas.Arrays;

import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        nomes[0] = "Diego";
        nomes[1] = "Gabriel";
        nomes[2] = "Lucas";
        System.out.println("Qual nome você deseja consultar?");
        System.out.println("1 - " + nomes[0]);
        System.out.println("2 - " + nomes[1]);
        System.out.println("3 - " + nomes[2]);
        int escolhaUsuario = scanner.nextInt();
        switch (escolhaUsuario){
            case 1:
                System.out.println(nomes[0]);
                System.out.println("CPF: 000.000.000-00");
                break;
            case 2:
                System.out.println(nomes[1]);
                System.out.println("CPF: 000.000.000-01");
                break;
            case 3:
                System.out.println(nomes[2]);
                System.out.println("CPF: 000.000.000-02");
                break;
            default:
                System.out.println("Você escolheu uma opção inválida!");
        }

    }
}
