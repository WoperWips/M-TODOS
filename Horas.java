import java.util.Scanner;

public class Horas {

    // Método para converter minutos em horas e minutos restantes
    public static String converterMinutos(int minutos) {
        // Calcula o número de horas inteiras a partir dos minutos
        int horas = minutos / 60;
        // Calcula os minutos restantes após contar as horas
        int minutosRestantes = minutos % 60;
        
        // Retorna a string formatada com a quantidade de horas e minutos
        return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
    }

    // Método principal onde o programa é executado
    public static void main(String[] args) {
        // Define a quantidade de minutos que será convertida
        int minutos = 90;

        // Chama o método converterMinutos e armazena o resultado na variável 'resultado'
        String resultado = converterMinutos(minutos);

        // Exibe o resultado da conversão para o usuário
        System.out.println(minutos + " minuto(s) = " + resultado);
    }
}
