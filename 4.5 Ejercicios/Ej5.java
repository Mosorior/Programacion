import java.util.Scanner;

public class Ej5 {
	
	public static void main (String[] args) {
        /*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0).*/

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca a: ");
        double a = s.nextDouble();
        System.out.print("Introduzca b: ");
        double b = s.nextDouble();
        System.out.print("Introduzca c: ");
        double c = s.nextDouble();
        System.out.println("X = " + ((c-b)/a));

    }
}