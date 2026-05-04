package JavaIntermediario.MeusDesafios.Des004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de números com ArrayList, objeto do OrdenadorNumero, scanners e status da estrutura de repetição
        List<Integer> listaNumeros = new ArrayList<>();
        OrdenadorNumero ordenadorNumero = new OrdenadorNumero();
        Scanner scanner = new Scanner(System.in);
        boolean ligado = true;


        // Estrutura de repetição WHILE. Enquanto ligado = true, o loop continuará funcionando.
        while (ligado){
            System.out.print("Digite um número: ");

            if (scanner.hasNextInt()){
                listaNumeros.add(scanner.nextInt());
                scanner.nextLine();
            }else {
                System.out.println("Entrada inválida! Digite apenas números inteiros");
                scanner.nextLine();
                continue;
            }



            // Se o tamanho da lista atingir 10, a cada loop é perguntado se o usuário deseja parar.
            if (listaNumeros.size() >= 10){
                System.out.print(listaNumeros.size() + " números digitados, deseja parar? [S/N]: ");
                String escolha = scanner.nextLine();

                // Se o usuário não digitar S ou N, é pedido para o usuário digitar novamente.
                while (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N")){
                    System.out.println("Opção inválida! Apenas [S/N] são permitidos.");
                    System.out.print("Deseja parar? [S/N]: ");
                    escolha = scanner.nextLine();
                }

                // Se o usuário deseja parar, o sistema troca o status da estrutura de repetição para false.
                if (escolha.equalsIgnoreCase("S")){
                    System.out.println("Programa encerrando...");
                    ligado = false;
                }
            }
        }


        // Criando a lista de números CRESCENTE e DECRESCENTE com o ordenadorNumero(passando a lista original como argumento)
        List<Integer> listaCrescente = ordenadorNumero.ordenarCrescente(listaNumeros);
        List<Integer> listaDecrescente = ordenadorNumero.ordenarDecrescente(listaNumeros);


        // Printando a lista em ordem de entrada, crescente e decrescente
        System.out.println("Lista em ordem de ENTRADA: " + listaNumeros);
        System.out.println("Lista em ordem CRESCENTE: " + listaCrescente);
        System.out.println("Lista em ordem DECRESCENTE: " + listaDecrescente);


        // Fechando o scanner.
        scanner.close();
    }
}
