import java.util.Scanner;


public class Ej1 {
	
	public static void main (String[] args) {
		/*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.*/
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos números a multiplicar: ");
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		
		System.out.println("La multiplicación de los 2 numeros es " + (x1*x2));
	}
}

