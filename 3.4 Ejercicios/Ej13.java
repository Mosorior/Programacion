import java.util.Scanner;
public class Ej13 {
	
	public static void main (String[] args) {
		/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/

		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la nota del primer examen: ");
		double x1 = s.nextDouble();
		System.out.print("Introduzca la nota que quiere sacar en el trimestre: ");
		double x3 = s.nextDouble();
		
		System.out.println("La nota que necesitas sacar en el segundo examen es " + (x3-(0.4*x1))/0.6);
	}
}

