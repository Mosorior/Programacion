import java.util.Scanner;
public class Ej09 {
    /* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado.*/
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        int i = 0;
        
        do{
            x/=10;
            i++;
        }while(x != 0);

        System.out.println("El número tiene " + i + " dígitos.");
			
	
	}


}