import java.util.Scanner;

public class Potencia {

    // Método para calcular a potência de um número 'a' elevado a 'b'
    public static double calcularPotencia(double a, double b) {
        // Utiliza o método Math.pow() da classe Math para calcular a potência
        return Math.pow(a, b);
    }

    // Método principal que será executado ao rodar o programa
    public static void main(String[] args) {
        // Define a base da potência como 2
        double base = 2;
        
        // Define o expoente como 3
        double expoente = 3;

        // Chama o método calcularPotencia passando base e expoente como parâmetros
        double resultado = calcularPotencia(base, expoente);

        // Exibe o resultado no formato "base elevado a expoente é resultado"
        System.out.println(base + " elevado a " + expoente + " é " + resultado);
    }
}
