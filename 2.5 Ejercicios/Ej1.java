public class Ej1 {
	
	public static void main (String[] args) {
		/*Escribe un programa en el que se declaren las variables enteras x e y. Asignales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/
		int x = 144;
		int y = 999;
		
		System.out.println("El valor de x es " + x);
		System.out.println("El valor de y es " + y);
		
		System.out.println("La suma es " + (x+y));
		System.out.println("La resta es " + (x-y));
		System.out.println("La división x/y es " + (x/y) + " y su módulo es " + (x%y));
		System.out.println("La división y/x es " + (y/x));
		System.out.println("La multiplicación es " + (x*y));


	}
}

