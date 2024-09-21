import java.util.Scanner;

public class Fatorial {

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        // Verificação se o número é negativo, o que não é permitido para o cálculo de fatorial
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }

        // Caso base: o fatorial de 0 é definido como 1
        if (n == 0) {
            return 1;
        }

        // Inicializa a variável 'resultado' para armazenar o valor do fatorial
        long resultado = 1;

        // Loop para multiplicar os números de 1 até n
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Multiplica o resultado pelo valor atual de i
        }

        // Retorna o valor final do fatorial
        return resultado;
    }

    // Método principal onde o programa começa a ser executado
    public static void main(String[] args) {
        // Define o número para o qual queremos calcular o fatorial
        int numero = 5;

        // Chama o método calcularFatorial e armazena o resultado
        long fatorial = calcularFatorial(numero);

        // Exibe o resultado do cálculo para o usuário
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
