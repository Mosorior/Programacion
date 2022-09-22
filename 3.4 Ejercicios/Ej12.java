import java.util.Scanner;
public class Ej12 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,

reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan

respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/
		
		Scanner s = new Scanner(System.in);
		double totalcode;
		double IVAp;
		double codpromo = 0;
		double CodeD;
		
		System.out.print("Introduzca la Base Imponible: ");
		double BI = s.nextDouble();
		
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String IVA = s.next();
		
		switch(IVA){
			case "general":
				IVAp = 0.21;
				break;
			case "reducido":
				IVAp = 0.1;
				break;
			case "superreducido":
				IVAp = 0.04;
				break;
			default:
				System.out.println("El IVA introducido no existe, se procederá con 21%.");
				IVAp = 0.21;
			}
			double totalIVA = (BI*IVAp)+BI;
			
		System.out.print("Introduzca un código promocional (nopro, mitad, meno5 o 5porc): ");
		String code = s.next();
		
		switch(code){
			case "nopro":
				codpromo = 0;
				break;
			case "mitad":
				codpromo= totalIVA/2;
				break;
			case "meno5":
				codpromo = 5;
				break;
			case "5porc":
				codpromo = totalIVA*0.05;
				break;
			default:
				System.out.println("El código no existe, se continuará sin código.");
			}
		System.out.println("Base imponible\t\t " + BI);
		System.out.println("Precio con IVA (" + IVA + ")\t\t " + totalIVA);
		System.out.println("Código promocional ("+ code + ")\t -" + codpromo);
		System.out.println("TOTAL\t\t " + (totalIVA-codpromo));

	}
}

