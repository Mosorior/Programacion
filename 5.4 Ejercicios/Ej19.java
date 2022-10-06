import java.util.Scanner;
public class Ej19 {
    public static void main (String[] args) {
        /* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura del triángulo equilatero: ");
        int h = s.nextInt();

        System.out.print("Introduzca el carácter de relleno: ");
        String c = s.next();
        
        int base = 1;
        int longi = 1;
        int space = h-1;

        while (base <= h) {

              for (int i = 1; i <= space; i++) {
                System.out.print(" ");
              }
          
              for (int i = 1; i <= longi; i++) {
                System.out.print(c);
              }
          
            System.out.println();
        
            base++;
            space--;
            longi+= 2;
        }
    }
}

