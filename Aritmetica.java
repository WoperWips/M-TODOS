import java.util.Scanner;

public class Aritmetica {

    // Método para calcular a média aritmética de três números
    public static void calcularMedia(double num1, double num2, double num3) {
        // Calcula a média somando os três números e dividindo por 3
        double media = (num1 + num2 + num3) / 3;
        
        // Exibe o resultado da média aritmética
        System.out.println("A média aritmética é: " + media);
    }

    // Método principal onde o programa é executado
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita o segundo número ao usuário
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita o terceiro número ao usuário
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        // Chama o método calcularMedia para calcular a média dos três números
        calcularMedia(numero1, numero2, numero3);

        // Fecha o objeto Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
