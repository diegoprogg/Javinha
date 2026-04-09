package exercicios.Desafio01DoJeitoQueEuFaria;

public class Ninja {
    String nome;
    int idade;
    boolean permissao;
    String missao;
    char nivelMissao;
    String statusMissao;

    public boolean permissao(){
        if (nivelMissao == 'A' || nivelMissao == 'B'){
            if (idade < 15){
                System.out.println("Você não pode acessar essa missão, pois ela é nível " + nivelMissao + ".");
                return false;
            }else {
                return true;
            }
        }
        return true;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        if (permissao() == false){
            return;
        }
        System.out.println("Nível da Missão: " + nivelMissao);
        System.out.println("Status da Missão: " + statusMissao);
    }
}
