import java.util.Scanner;

public class Maiornumero {

    // Método para encontrar o maior número entre três valores
    public static int encontrarnumeroMaior(int a, int b, int c) {
        // Verifica se 'a' é maior ou igual a 'b' e 'c'
        if (a >= b && a >= c) {
            return a;  // Retorna 'a' se for o maior
        }
        // Caso contrário, verifica se 'b' é maior ou igual a 'c'
        else if (b >= c) {
            return b;  // Retorna 'b' se for o maior
        }
        // Se nem 'a' nem 'b' forem os maiores, então 'c' é o maior
        else {
            return c;  // Retorna 'c' como o maior número
        }
    }

    // Método principal onde o programa é executado
    public static void main(String[] args) {
        // Define os três números que serão comparados
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 15;

        // Chama o método encontrarnumeroMaior para descobrir o maior número
        int maior = encontrarnumeroMaior(numero1, numero2, numero3);

        // Exibe o maior número encontrado
        System.out.println("O maior número é: " + maior);
    }
}
