import java.util.Scanner;


public class Ej7 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el total de una factura a partir de la base
imponible.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba el total de la factura: ");
		double BI = s.nextDouble();
		
		System.out.print("PRECIO \t" + BI + "€. \n");
		System.out.print("IVA \t" + (0.21*BI)+ "€. \n");
		System.out.print("TOTAL \t" + ((0.21*BI)+BI) + "€. \n");
	}
}

