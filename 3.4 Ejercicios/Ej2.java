public class Ej2 {
	public static void main (String[] args) {
				/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.*/

		System.out.print("Introduzca la cantidad de euros a convertir en pesetas: ");
		int euros = Integer.parseInt(System.console().readLine());
		
		System.out.println(euros + " euros son " + (euros*166.03) + " pesetas.");

	}
}

