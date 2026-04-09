package JavaBasico.Aulas.LacoDeRepeticao;

public class AulaWhile {
    public static void main(String[] args) {
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 35;
        while (numeroDeClones <= numeroMaximoDeClones){
            System.out.println("Clone: " + numeroDeClones++);
        }
    }
}