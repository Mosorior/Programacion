
import java.util.Scanner;
public class Ej34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número: ");
    long n1 = s.nextLong();

    System.out.print("Introduzca otro número: ");
    long n2 = s.nextLong();

    long n = n1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (n == 0) {
      longitud = 1;
    }
    
    while (n > 0) {
      volteado1 = (volteado1 * 10) + (n % 10);
      n /= 10;
      longitud++;
    }

    n = n2;
    long volteado2 = 0;
    
    while (n > 0) {
      volteado2 = (volteado2 * 10) + (n % 10);
      n /= 10;
    }

    long par = 0;
    long impar = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado1 % 10);

      if ((digito % 2) == 0) {
        par = par * 10 + digito;
      } else {
        impar = impar * 10 + digito;
      }

      digito = (int)(volteado2 % 10);

      if ((digito % 2) == 0) {
        par = par * 10 + digito;
      } else {
        impar = impar * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    System.out.println("El número formado por los dígitos pares es: " + par);
    System.out.println("El número formado por los dígitos impares es: " + impar);
  }
}
