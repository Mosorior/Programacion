import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
    
        /* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante. */

        Scanner s = new Scanner(System.in);

    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números separados por enter:");

    for (i = 0; i < 10; i++) {
      n[i] = s.nextInt();

      esPrimo = true;
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        primo[primos++] = n[i];
      } else {
        noPrimo[noPrimos++] = n[i];
      }
    }
    
    System.out.println("\n\nArray original:");
    System.out.print("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.print(i + "\t");
    }
    System.out.print("Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.print( n[i] + "\t");
    }
    
    for (i = 0; i < primos; i++) {
      n[i] = primo[i];
    }

    for (i = primos; i < primos + noPrimos; i++) {
      n[i] = noPrimo[i - primos];
    }

    System.out.println("\n\nArray con los primos al principio:");
    System.out.print("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.print(i + "\t");
    }
    System.out.print("Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.print(n[i]+ "\t");
    }
    }
}

