

public class Operadores {
	
	public static void main (String[] args) {
		/*
		 * + Suma 20 + x
		 * - Resta 20 - x
		 * * Multiplicación 20 * x
		 * / División 10 / 3 (saca 3)
		 * % Módulo (resto) 10 % 3 (saca 1)
		 * ++ Incremento (en 1)
		 * -- Decremento (en 1)
		*/
		
		int x = 100;
		
		System.out.println(x + " " + (x+5) + " " + (x-5));
		System.out.println((x*5) + " " + (x/5)+ " " + (x%5));
		System.out.println((x++)+ " " + (x--));
		
		System.out.println("En el caso de usar doubles: ");
		
		x = 100;
		int y = 30;
		double division;
		
		division = (double) (x/y);
		System.out.println(division);
	}
}

