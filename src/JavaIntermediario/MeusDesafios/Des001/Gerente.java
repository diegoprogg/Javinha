package JavaIntermediario.MeusDesafios.Des001;

public class Gerente extends Funcionario implements Autenticavel{
    @Override
    public void calcularBonus() {
        System.out.println("Olá, meu nome é " + nome + " e meu bônus como Gerente é de " + "R$" + (0.2 * salario));
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public Gerente(){

    }

    public Gerente(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals("admin")){
            System.out.println("Olá " + nome + "! Bem vindo ao sistema.");
            return true;
        }else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

}
