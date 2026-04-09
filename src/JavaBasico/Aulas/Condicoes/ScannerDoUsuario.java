package JavaBasico.Aulas.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome
        System.out.println("Digite o seu nome: ");
        String nome = caixaDeTexto.nextLine();

        // Recebe a idade
        System.out.println("Digite a sua idade: ");
        int idade = caixaDeTexto.nextInt();

        // Imprime
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
                // Verificação de Idade
        if (idade >= 18){
            System.out.println("Usuário maior de idade.");
        }else {
            System.out.println("Usuário menor de idade.");
        }
    }
}
