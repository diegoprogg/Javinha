package JavaIntermediario.MeusDesafios.Des001;

public class Desenvolvedor extends Funcionario{
    @Override
    public void calcularBonus() {
        System.out.println("Olá, meu nome é " + nome + " e meu Bônus como Gerente é de " + "R$" + (salario * 0.15));
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public Desenvolvedor(){

    }

    public Desenvolvedor(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }
}
