import java.util.Scanner;
public class Ej10 {
    /* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca todos los números de los que quiera hacer la media. Cuando termine, inserte un número negativo: ");

        int x = 0;
        int total = 0;
        int i = 0;
        do{
            x =  s.nextInt();
            total += x;
            i++;
        }while(x >= 0);

        total-= x;
        System.out.println("La media de todos los números es " + total/(i-1));
    }


}