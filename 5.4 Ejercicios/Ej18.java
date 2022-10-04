import java.util.Scanner;
public class Ej18 {
    public static void main (String[] args) {
    /* Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7. */
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 2 números enteros: ");
    int x = s.nextInt();
    int y = s.nextInt();

    if (x == y){
        System.out.println("No puede ser el mismo número.");
    }
    
    if (y > x){
        for(int i = x; i < y; i+= 7){
            System.out.println(i);
        }
    }
    if(x > y){
        for(int i = y; i < x; i+= 7){
            System.out.println(i);
        }
    }

    }
}
