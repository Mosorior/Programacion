import java.util.Scanner;
public class Ej8 {
	
	public static void main (String[] args) {
		/*Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca las horas trabajadas diariamente: ");
		int h = s.nextInt();
		
		System.out.println("Si este trabajador trabaja " + h + " horas diarias, le corresponderían " + (h*12*7) + "€ semanales.");

	}
}

