import java.util.Scanner;
public class Ej17 {
    /*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número entero:");
        int x = s.nextInt();

        System.out.println("La última cifra es "+ (x % 10));

    }
}
