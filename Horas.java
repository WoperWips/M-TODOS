import java.util.Scanner;
   public class Horas {
    //definir calculo em minutos
    public static String converterMinutos(int minutos) {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        
        return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
    }
    //exbir para usário 
    public static void main(String[] args) {
        int minutos = 90;

        String resultado = converterMinutos(minutos);
        System.out.println(minutos + " minuto(s) = " + resultado);
    }
}