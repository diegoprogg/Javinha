package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica01;

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
            System.out.print("Digite um número: ");
            if (scanner.hasNextInt()){
                listaNumeros.add(scanner.nextInt());
                scanner.nextLine();
            }else {
                System.out.println("Número inválido! Apenas números inteiros são permitidos!");
                scanner.nextLine();
                continue;
            }
            System.out.print(listaNumeros.size() + " número(s) digitado(s)!");

            if (listaNumeros.size() >= 10){
                System.out.print(listaNumeros.size() + " números digitados, deseja parar? [S/N]: ");
                String escolha = scanner.nextLine();

                while (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N")){
                    System.out.println("Opção inválida! Só é permitido [S/N], tente novamente!");
                    System.out.print(listaNumeros.size() + " números digitados, deseja parar? [S/N]: ");
                    escolha = scanner.nextLine();

                }

                if (escolha.equalsIgnoreCase("S")){
                    System.out.println("Programa encerrando, " + listaNumeros.size() + " números digitados.");
                    statusLoop = false;
                }
            }
        }


        List<Integer> listaCrescente = ordenadorNumero.ordenadorCrescente(listaNumeros);
        List<Integer> listaDecrescente = ordenadorNumero.ordenadorDecrescente(listaNumeros);

        System.out.println("Lista em ordem de entrada: " + listaNumeros);
        System.out.println("Lista em ordem CRESCENTE: " + listaCrescente);
        System.out.println("Lista em ordem DECRESCENTE: " + listaDecrescente);
    }
}
