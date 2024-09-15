import java.util.Scanner;

public class PositivoNegativo {

    public static void verificarNumero(int numero) {
        if (numero >= 0) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        verificarNumero(numero);

        scanner.close();
    }
}
