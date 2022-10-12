import java.util.Scanner;
public class Ej27 {
    public static void main (String[] args){
/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = s.nextInt();
        int count = 0;
        int sum= 0;

        for(int i = 0; i <= n; i+=3){
            System.out.println(i);
            count++;
            sum = sum+i;
        }
        System.out.print("\n Son " + count + " números que suman " + sum);
    }
}
