public class Leenumero {
	
	public static void main (String[] args) {
		String linea;
		System.out.print("Introduce un numero: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		
		System.out.println("El número introducido es " + primerNumero);
		
		System.out.print("Introduzca otro número: ");
		
		int segundoNumero = Integer.parseInt(System.console().readLine());
		
		System.out.println("La suma de ambos números es " + (primerNumero + segundoNumero));
	}
}

