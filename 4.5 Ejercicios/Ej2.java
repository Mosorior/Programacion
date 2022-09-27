import java.util.Scanner;


public class Ej2 {
	
	public static void main (String[] args) {
		/*Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.*/
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca una hora en punto: ");
		int x = s.nextInt();
		
		if (x >= 0 && x < 6){
			System.out.println("Buenas noches");
			}
		if (x >= 6 && x < 12){
			System.out.println("Buenos días");
			}
		if (x >= 12 && x < 20){
			System.out.println("Buenas tardes");
			}
		if (x >= 20 && x <=24){
			System.out.println("Buenas noches");
			}
		if (x < 0 || x > 24){
			System.out.println("Hora inválida");
			}
	}
}

