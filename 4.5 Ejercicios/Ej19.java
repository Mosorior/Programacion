import java.util.Scanner;
public class Ej19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int y, x = 0;
    
    System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
    y = Math.abs(s.nextInt());
    
    if ( y < 10 ) {
      x = 1;
    }
    
    if (( y >= 10 ) && ( y < 100 )) {
      x = 2;
    }
    
    if (( y >= 100 ) && ( y < 1000 )) {
      x = 3;
    }
    
    if (( y >= 1000 ) && ( y < 10000 )) {
      x = 4;
    }
    
    if ( y >= 10000 ) {
      x = 5;
    }
    
    if (x == 1) {
      System.out.println("El número introducido tiene 1 dígito.");
    } else {
      System.out.println("El número introducido tiene " + x + " dígitos.");
    }
  }
}
