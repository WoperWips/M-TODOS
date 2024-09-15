import java.util.Scanner;

public class Potencia {

    public static double calcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        double base = 2;
        double expoente = 3;

        double resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é " + resultado);
    }
}