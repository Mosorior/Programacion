import java.util.Scanner;
public class Ej23 {
    public static void main (String[] args){
    /* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca números.");
        int sum = 0;
        int i = 0;
        int introd = 0;
        int sumtotal = 0;
        while(sumtotal < 10000){
            i++;
            introd = s.nextInt();
            sumtotal+=introd;
            if(sumtotal < 10000){
            sum+= introd;
            }
        }
        System.out.println("El total es " + sum);
        System.out.println("Se escribieron "+ (i-1) + " números.");
        System.out.println("La media es de " + (sum/i));

    }
}
