import java.util.Scanner;

    public class Fatorial {
        //Definindo como é feito fatorial
     public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }

        if (n == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
        //Exibir para o usário e definição do número
    public static void main(String[] args) {
        int numero = 5;

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}