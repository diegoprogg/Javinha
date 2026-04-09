package JavaBasico.Aulas.LacoDeRepeticao;

import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= num ; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("Soma: " + soma);
        scanner.close();
    }
}
