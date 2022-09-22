public class Ej6 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/
		double baseimponible = 36.78;
		
		System.out.println("La factura es de " + baseimponible + " euros, con el IVA(21%) se queda en " + ((0.21*baseimponible)+baseimponible));
		
	}
}

