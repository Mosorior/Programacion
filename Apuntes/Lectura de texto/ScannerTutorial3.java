import java.util.Scanner;


public class ScannerTutorial3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 3 números (pueden contener decimales) separados por espacios: ");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		
		System.out.println("La media de los 3 es " + ((x1+x2+x3)/3));
	}
}

