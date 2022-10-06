import java.util.Scanner;
public class Ej25 {
    
    public static void main (String[] args){

        /* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */
    
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");

        int x = s.nextInt();
        int rev = 0;

        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
          }

        System.out.println("El número al revés es " + rev);

    }

}
