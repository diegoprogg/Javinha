package DesafiosCodeWars;

public class SumArray {

    public static double sum(double[] numbers) {
        double sumNumbers = 0;
        for (double numero : numbers){
            sumNumbers += numero;
        }
        return sumNumbers;
    }
}
