import java.util.Scanner;
public class Ej18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    /*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras. */

        System.out.println("Introduzca un número cualquiera de máximo 5 cifras.");
        int x = s.nextInt();
        int y = 0;


        if ( x < 10 ) {
            y = x;
        }
          
        if (( x >= 10 ) && ( x < 100 )) {
            y = x / 10;
        }
          
        if (( x >= 100 ) && ( x < 1000 )) {
            y = x / 100;
        }
          
        if (( x >= 1000 ) && ( x < 10000 )) {
            y = x / 1000;
        }
          
        if ( x >= 10000 ) {
            y = x / 10000;
        }
          
        System.out.println("La primera cifra del número introducido es el " + y + ".");
    }
    
}