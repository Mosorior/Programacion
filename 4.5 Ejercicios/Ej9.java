import java.util.Scanner;
public class Ej9 {
    public static void main (String[] args){
    /*Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).*/
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca a:");
        double a = s.nextDouble();
        System.out.print("Introduzca b:");
        double b = s.nextDouble();
        System.out.print("Introduzca c:");
        double c = s.nextDouble();

        double resmen = ((((0-b)-(Math.sqrt((b*b)-(4*a*c))))/2*a));
        double resmas = ((((0-b)+(Math.sqrt((b*b)-(4*a*c))))/2*a));

        System.out.println("X puede ser " + resmas + " o " + resmen);
    }
}