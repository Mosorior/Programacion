import java.util.Scanner;
public class Ej1 {
	
	public static void main (String[] args) {
		/*Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.*/
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Introduzca un día de la semana (Lun, Mar, Mie, Jue, Vie): ");
			String dia = s.next();
			
			switch(dia){

				case "Lun":
					System.out.println("A las 8:00, Base de datos.");
					break;
				case "Mar":
					System.out.println("A las 8:00, Entorno de desarrollo.");
					break;
				case "Mie":
					System.out.println("A las 8:00, Programación.");
					break;
				case "Jue":
					System.out.println("A las 8:00, Entorno de desarrollo.");
					break;
				case "Vie":
					System.out.println("A las 8:00, Base de datos.");
					break;
				default:
					System.out.println("No ha introducido un dia correcto.");
			}
		}
	}
}

