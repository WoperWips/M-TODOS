import java.util.Scanner;

public class Aritmetica {
    //Definir os valores de calculo
    public static void calcularMedia(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        System.out.println("A media aritmetica e: " + media);
    }
    //Scanner para edição para o usário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double numero3 = scanner.nextDouble();

        calcularMedia(numero1, numero2, numero3);

        scanner.close();
    }
}
