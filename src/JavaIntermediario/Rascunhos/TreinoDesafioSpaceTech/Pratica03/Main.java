package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        OrdenadorNumeros ordenadorNumeros = new OrdenadorNumeros();
        boolean statusLoop = true;

        while (statusLoop){
            System.out.println("Digite um número: ");
            if (scanner.hasNextInt()){
                listaNumeros.add(scanner.nextInt());
                scanner.nextLine();
            }else {
                System.out.println("Número inválido! Apenas números inteiros são permitidos!");
                scanner.nextLine();
            }

            if (listaNumeros.size() >= 10){
                System.out.println(listaNumeros.size() + " números foram digitados, deseja continuar? [S/N]: ");
                String escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("N")){
                    System.out.println(listaNumeros.size() + " números digitados. Encerrando programa...");
                    statusLoop = false;
                }
                while (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N")){
                    System.out.println("Opção inválida, apenas [S/N] são permitidos.");
                    System.out.println("Deseja continuar? [S/N]: ");
                    escolha = scanner.nextLine();
                }
            }
        }


        List<Integer> listaCrescente = ordenadorNumeros.ordenarCrescente(listaNumeros);
        List<Integer> listaDecrescente = ordenadorNumeros.ordenarDecrescente(listaNumeros);

        System.out.println("Números em ordem de entrada: " + listaNumeros);
        System.out.println("Números em ordem CRESCENTE: " + listaCrescente);
        System.out.println("Números em ordem DECRESCENTE: " + listaDecrescente);
    }
}
