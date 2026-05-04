package JavaIntermediario.MeusDesafios.Des002;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Criando a lista de números com ArrayList, scanners e status da estrutura de repetição
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean ligado = true;


        // Estrutura de repetição FOR. Enquanto ligado == true, o loop continuará continuando e aumentando uma iteração.
        for (int i = 0; ligado; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            // A partir do momento que a quantidade de números é 10 ou mais, o sistema pergunta a cada loop se o usuário deseja parar.
            if (i >= 9){
                System.out.println(numeros.size() + " números digitados, " + "deseja parar? [S/N]");
                String resposta = scanner.next();
                // Se o usuário deseja parar, o sistema troca o status da estrutura de repetição para false.
                if (resposta.equalsIgnoreCase("S")){
                    System.out.println("Encerrando sistema...");
                    ligado = false;
                    break;
                }
            }
        }

        // Criando uma cópia da lista original e tornando-a crescente
        ArrayList<Integer> listaCrescente = new ArrayList<>(numeros);
        Collections.sort(listaCrescente);
        // Printando a lista crescente
        System.out.println("Números em ordem Crescente: " + listaCrescente);



        // Criando uma cópia da lista original e tornando-a decrescente
        ArrayList<Integer> listaDecrescente = new ArrayList<>(numeros);
        listaDecrescente.sort(Collections.reverseOrder());
        // Printando a lista decrescente
        System.out.println("Numeros em ordem Decrescente: " + listaDecrescente);

    }
}
