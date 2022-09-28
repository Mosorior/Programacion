import java.util.Scanner;
public class Ej14 {
    /*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = s.nextInt();

        int rest = num%2;
        if (rest == 0){
            System.out.println("El número es par.");
        }
        else{
            System.out.println("El número es impar.");
        }

        int rest5 =num%5;
        if (rest5 == 0){
            System.out.println("El número es divisible entre 5.");
        }
        else{
            System.out.println("El número no se puede dividir entre 5.");
        }
    }
}
