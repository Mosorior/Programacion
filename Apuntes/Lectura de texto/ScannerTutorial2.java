import java.util.Scanner;


public class ScannerTutorial2 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce nombre y edad: ");
		String nombre = s.next();
		int edad = s.nextInt();
		
		System.out.println("Tu nombre es " + nombre + " y tu edad " + edad);
	}
}

