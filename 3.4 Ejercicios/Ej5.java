public class Ej5 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca los lados del rectángulo separados: ");
		int x = Integer.parseInt(System.console().readLine());
		int y = Integer.parseInt(System.console().readLine());
		System.out.print("El área del rectángulo es de " + (x*y) + "u²");
	}
}

