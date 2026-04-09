package JavaBasico.Aulas.Condicoes;

public class IFeElse {
    public static void main(String[] args) {
        String nome = "Diego";
        int dinheiro = 67;
        if (dinheiro >= 0 && dinheiro <= 50){
            System.out.println("zero fupa, arruma emprego");
        } else if (dinheiro > 50 && dinheiro <= 100) {
            System.out.println("fupa mínima, é bom trabalhar ne");
        } else if (dinheiro > 100 && dinheiro <= 500) {
            System.out.println("fupa média, começou a trabalhar?");
        } else if (dinheiro > 500) {
            System.out.println("TÁ COM A FUPA MÁXIMA HEIN PAINHO");
        }
    }
}
