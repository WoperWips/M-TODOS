import java.util.Scanner;

public class PositivoNegativo {

    // Método para verificar se o número é positivo ou negativo
    public static void verificarNumero(int numero) {
        // Verifica se o número é maior ou igual a zero
        if (numero >= 0) {
            // Se for, exibe que o número é positivo
            System.out.println(numero + " é positivo.");
        } else {
            // Caso contrário, exibe que o número é negativo
            System.out.println(numero + " é negativo.");
        }
    }

    // Método principal que será executado ao rodar o programa
    public static void main(String[] args) {
        // Cria uma instância da classe Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número
        System.out.print("Digite um número: ");
        // Lê o número inteiro digitado pelo usuário
        int numero = scanner.nextInt();

        // Chama o método verificarNumero para verificar se o número é positivo ou negativo
        verificarNumero(numero);

        scanner.close();
    }
}
