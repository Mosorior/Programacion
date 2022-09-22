import java.util.Scanner;
public class Ej9 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el volumen de un cono según la fórmula V =(1/3)πr²h.*/
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el radio del cono: ");
		double r = s.nextDouble();
		System.out.print("Introduzca la altura del cono: ");
		double h = s.nextDouble();
		System.out.println("El volumen del cono es de " + ((double)1/3)*Math.PI*r*r*h + " u².");
	}
}

