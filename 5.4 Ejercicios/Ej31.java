import java.util.Scanner;
public class Ej31 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      System.out.print("Introduzca la altura de la L: ");
      int h = s.nextInt();
  
      for (int i = 1; i < h; i++) {
        System.out.println("*");
      }
  
      for (int i = 0; i < h / 2 + 1; i++) {
        System.out.print("* ");
      }
  
    }
  }