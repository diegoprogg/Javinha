package JavaIntermediario.MeusDesafios.Des001;

public class Main {
    public static void main(String[] args) {

        // Instanciando objetos Gerente e Desenvolvedor com suas características no AllArgs Constructor
        Gerente marcos = new Gerente("Marcos Henrique", 15000);
        Desenvolvedor diego = new Desenvolvedor("Diego Carlos", 10000);

        // Teste Processar Funcionario Gerente
        marcos.processarFuncionario(marcos);

        // Teste Processar Funcionario Desenvolvedor
        diego.processarFuncionario(diego);

        // Teste Autenticavel
        marcos.autenticar("admin");
    }
}
