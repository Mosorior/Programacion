import java.util.Scanner;
public class Ej4 {
	
	public static void main (String[] args) {
		/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.*/
	Scanner s = new Scanner(System.in);
	
	System.out.print("Introduzca las horas trabajadas: ");
		int h = s.nextInt();
		int he = 0;
		
		if(h >= 41){
			he = h-40;
			}
		
		System.out.println("Si este trabajador trabaja " + h + " horas, le corresponderían " + ((h*12)+(he*16)) + "€ . "+ (he*16) + "€ son de horas extra.");

	}
}

