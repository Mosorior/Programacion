import java.util.Scanner;
public class Ej6 {
    public static void main (String[] args) {

        /*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. Aplica la fórmula t = √((2h)/g) siendo g = 9.81m/s² */

        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca la altura: ");
        double h = s.nextDouble();

        System.out.println("Tardará " + ((2*h)/9.81) + "s en caer.");
    }
}
