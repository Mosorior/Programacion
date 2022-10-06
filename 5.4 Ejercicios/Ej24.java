import java.util.Scanner;
public class Ej24 {
    
    public static void main (String[] args){
/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
       1
      121
     12321
    1234321 */

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la pirámide: ");
        int x = s.nextInt();

    int h = 1;
    int i = 0;
    int spaces = x - 1;
    
    while (h <= x) {
      
      for (i = 1; i <= spaces; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < h; i++) {
        System.out.print(i);
      }
      
      for (i = h; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      h++;
      spaces--;
    }


    }
}
