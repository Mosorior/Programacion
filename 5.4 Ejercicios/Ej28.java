import java.util.Scanner;
public class Ej28 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int x;
      
      do {
        System.out.print("Introduzca un número entero: ");
        x = s.nextInt();
        
        if (x < 0) {
          System.out.println("El número introducido no es correcto.");
        }
      } while (x < 0);
  
      int fact = x;
      
      if (x == 0) {
        System.out.println("0! = 1");
      } else {
        for (int i = 1; i < x; i++) {
          fact *= i;
        }
  
        System.out.println(x + "! = " + fact);
      }
    }
  }