import java.util.Scanner;
public class Ej10 {
	
	public static void main (String[] args) {
		/*Realiza un conversor de Mb a Kb.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de Mb: ");
		
		double mb = s.nextDouble();
		System.out.println(mb + "Mb son " + (mb*1000) + "Kb.");
	}
}

