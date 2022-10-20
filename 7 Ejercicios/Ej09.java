import java.util.Scanner;
public class Ej09 {
    public static void main(String[] args) {

        /* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 8 números enteros separados por enter: ");

        int[] num;
        num = new int[8];

        for(int i = 0; i < 8; i++){
            num[i] = s.nextInt();
        }

        System.out.println("Estos son los números: ");
        for(int i = 0; i < 8; i++){
            System.out.print(num[i]);
            if((num[i]%2) == 0){
                System.out.print(" <-- PAR\n");
            }
            else{
                System.out.print(" <-- IMPAR\n");
            }
        }

    }
}
