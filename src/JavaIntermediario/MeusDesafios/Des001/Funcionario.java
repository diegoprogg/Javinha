package JavaIntermediario.MeusDesafios.Des001;

public abstract class Funcionario {
    String nome;
    int salario;

    public abstract void calcularBonus();
    public abstract void exibirDados();

    public void processarFuncionario(Funcionario funcionario){
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
