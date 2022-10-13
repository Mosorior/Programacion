import java.util.Scanner;
public class Ej12 {
    /* Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado. */

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número de factores de Fibonacci: ");
        int a = 0;
        int b = 1;
        int n = s.nextInt();
        int i = 0;
        int c = 0;

        System.out.println("\n\n FIBONNACI \n\n");
        switch(n){
            case 1:
            System.out.println("0");
            break;
            case 2:
            System.out.println("0\n1");
            break;
            default:
            System.out.println("0");
            do{
                a = b;
                b = c;
                c = a+b;
                System.out.println(c);
                i++;
            }while(i < n-1);	
        }
        		
	}

}