//Escribe un programa que pase de binario a decimal.
import java.util.Scanner;
public class Ej17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double[] binario = {1000};
        int exp = 0;
        double decimal = 0;

        System.out.println("Introduzca un número binario:");
        decimal = s.nextDouble();

        for(int i = 0; i < binario.length; i++) {
            for(exp = 0; exp < 4; exp++) {
                decimal = binario[i] * (int)Ej01to14.potencia(2, exp);
            }
        }
        System.out.println(decimal + " en binario es "+ binario);
    }
    
}
