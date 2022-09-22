import java.util.Scanner;
public class Ej11 {
	
	public static void main (String[] args) {
		/*Realiza un conversor de Mb a Kb.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de KB: ");
		
		double kb = s.nextDouble();
		System.out.println(kb + "KB son " + (kb/1000) + "MB.");
	}
}
