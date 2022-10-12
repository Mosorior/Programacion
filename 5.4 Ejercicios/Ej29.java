import java.util.Scanner;
public class Ej29 {
   /* 29. Escribe un programa que muestre por pantalla  todos  los números enteros positivos menores*/


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero positivo: ");
    int numGrande = s.nextInt();

    System.out.print("Introduzca otro número: ");
    int numPequeno = s.nextInt();

    System.out.print("Los números enteros positivos menores que " + numGrande );
    System.out.println(" que no son divisibles entre " + numPequeno + " son los siguientes:");

    for (int i = 1; i < numGrande; i++) {
      if ((i % numPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}