import java.util.Scanner;
public class Ej11 {
    /* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        int i = 0;
        
        do{
            System.out.println(x + "\t" + (x*x) + "\t" + (x*x*x));
            i++;
            x++;
        }while(i <= 4);			
	}

}
