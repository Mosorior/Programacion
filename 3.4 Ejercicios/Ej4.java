import java.util.Scanner;
public class Ej4 {
	
	public static void main (String[] args) {
		/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.*/
		System.out.print("Introduzca dos números: ");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		
		System.out.println("La suma es " + (x1+x2) + ". La resta es " + (x1-x2) + ". La multiplicación es " + (x1*x2) + ". La división es " + (x1/x2));
	}
}

