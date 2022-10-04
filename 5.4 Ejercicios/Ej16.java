import java.util.Scanner;
public class Ej16 {
        /* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número y te diré si es primo: ");
        int x = s.nextInt();
        boolean primo = true;
        for(int i = 2; i< x; i++){
            if(x%i == 0){
                primo = false;
            }
        }

        if(primo){
            System.out.println("\nEs primo");
        }
        else{
            System.out.println("\nNo es primo");
        }

    }
}
