package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica02;

import JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica01.OrdenadorNumero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        OrdenadorNumero ordenadorNumero = new OrdenadorNumero();
        Scanner scanner = new Scanner(System.in);
        boolean statusLoop = true;

        while (statusLoop){
            System.out.println("Digite um número: ");
            if (scanner.hasNextInt()){
                listaNumeros.add(scanner.nextInt());
                scanner.nextLine();
            }else {
                System.out.println("Número inválido! Apenas números inteiros são permitidos!");
                scanner.nextLine();
                continue;
            }

            if (listaNumeros.size() >= 10){
                System.out.print(listaNumeros.size() + " números digitados, deseja continuar? [S/N]: ");
                String escolha = scanner.nextLine();
                if (escolha.equalsIgnoreCase("N")){
                    System.out.println("Programa encerrado! " + listaNumeros.size() + " números digitados.");
                    statusLoop = false;
                }
                while (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N")){
                    System.out.println("Opção inválida, apenas [S/N] permitidos! ");
                    System.out.print(listaNumeros.size() + " números digitados, deseja continuar? [S/N]: ");
                    escolha = scanner.nextLine();
                }

            }
        }


        List<Integer> listaCrescente = ordenadorNumero.ordenadorCrescente(listaNumeros);
        List<Integer> listaDecrescente = ordenadorNumero.ordenadorDecrescente(listaNumeros);

        System.out.println("Lista em ordem Crescente: " + listaCrescente);
        System.out.println("Lista em ordem Decrescente: " + listaDecrescente);
    }
}
