import java.util.Scanner;
public class Ej6 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el área de un triángulo.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba la base y la altura del triángulo: ");
		int x = s.nextInt();
		int y = s.nextInt();
		
		System.out.println("El área del triángulo es de " + ((x*y)/2) + " u².");
	}
}

