import java.util.Scanner;
public class Ej7 {
 public static void main (String[] args){
/*Realiza un programa que calcule la media de tres notas*/
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca las 3 notas: ");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    double x3 = s.nextDouble();

    System.out.println("La media es " + (x1+x2+x3)/3);

 }   
}
