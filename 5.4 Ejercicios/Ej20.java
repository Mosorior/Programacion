import java.util.Scanner;
public class Ej20 {
    public static void main (String[] args) {
        /* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int hi = s.nextInt();
    
        System.out.print("Introduzca el carácter de relleno: ");
        String c= s.next();
        
        int h = 1;
        int i = 0;
        int spah = hi - 1;
        int insp = 0;
        
        while (h < hi) {
          
          // inserta espacios delante
          for (i = 1; i <= spah; i++) {
            System.out.print(" ");
          }
          
          System.out.print(c);
          for (i = 1; i < insp; i++) {
            System.out.print(" ");
          }
          
          if (h>1) {
            System.out.print(c);
          }
          
          System.out.println();
          h++;
          spah--;
          insp += 2;
        }
        
        for (i = 1; i < h*2; i++) {
          System.out.print(c);
        }
      }
}

