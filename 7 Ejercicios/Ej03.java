import java.util.Scanner;
public class Ej03 {
    public static void main(String[] args) {
    /*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa. */
        Scanner s = new Scanner(System.in);

        int[] num;
        num = new int[10];

        System.out.println("Introduzca 10 números separados por enter:");

        for(int i = 0; i < 10; i++){
            num[i] = s.nextInt();
        }

        System.out.println("Al revés sería así:");
        for(int i = 9; i > -1; i--){
            System.out.println(num[i]);
        }

    }
}
