package JavaIntermediario.Aulas.Aula06ClassesAbstratas;


// Classes abstratas não permitem instanciação, apenas a partir de suas filhas
public abstract class Hokages implements FalaApresentacao {
    String nome;
    int idade;
    double altura;
    boolean vivo;

    public abstract void sabedoriaHokage();

}
