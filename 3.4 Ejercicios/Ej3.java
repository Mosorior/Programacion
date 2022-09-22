public class Ej3 {
	
	public static void main (String[] args) {
		/*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.*/
		System.out.print("Introduzca la cantidad de pesetas a convertir en euros: ");
		int pesetas = Integer.parseInt(System.console().readLine());
		
		System.out.println(pesetas + " pesetas son " + (pesetas/166.03) + " euros.");
		
	}
}

