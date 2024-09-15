import java.util.Scanner;
    
    public class Maiornumero {
        //Calculor para encontra o numero maior
        public static int encontrarnumeroMaior(int a, int b, int c) {
            if (a >= b && a >= c) {
                return a;
            }
            else if (b >= c) {
                return b;        
            }
            else {
                return c;
            }
        }
        //Definição dos números
        public static void main(String[] args) {
            
            int numero1 = 10;
            int numero2 = 20;
            int numero3 = 15;
            
            int maior = encontrarnumeroMaior(numero1, numero2, numero3);
                System.out.println("Maior numero é:" + maior);
        }
}